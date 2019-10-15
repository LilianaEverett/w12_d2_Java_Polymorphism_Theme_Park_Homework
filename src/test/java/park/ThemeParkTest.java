package park;

import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import static org.junit.Assert.*;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;

    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    Visitor visitor;

    @Before
    public void before() {
        themePark = new ThemePark("Euro Disney");

        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);

        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 5);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 7);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 4);

        visitor = new Visitor(30, 1.7, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Euro Disney", themePark.getName());
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(dodgems);
        assertEquals(1, themePark.attractionsCount());
    }

    @Test
    public void canAddStall() {
        themePark.addStall(tobaccoStall);
        assertEquals(1, themePark.stallsCount());
    }

    @Test
    public void canGetAllReviewed() {
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(dodgems);
        assertEquals(2, themePark.getAllReviewed().size());
    }

    @Test
    public void aVisitorCanVisitAAttraction() {
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(dodgems);
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, visitor.visitedAttractionsCount());
        assertEquals(1, rollerCoaster.getVisitCount());
    }
}
