package people;

import attractions.Attraction;
import attractions.*;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import stalls.*;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    RollerCoaster rollerCoaster;
    Playground playground;

    @Before
    public void before(){

        visitor = new Visitor(14, 1.2, 40.0);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        playground = new Playground("Fun Zone", 7);

    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void visitedAttractions() {
        visitor.addVisitedAttraction(rollerCoaster);
        visitor.addVisitedAttraction(playground);
        assertEquals(2, visitor.visitedAttractionsCount());
    }
}
