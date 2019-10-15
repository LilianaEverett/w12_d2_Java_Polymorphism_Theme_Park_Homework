package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 4);
        visitor = new Visitor(30, 180, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void isAllowedToBuyTobacco() {
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasRate() {
        assertEquals(4, tobaccoStall.getRating());
    }
}
