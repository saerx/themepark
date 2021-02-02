package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor adult;
    Visitor child;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);

    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isAllowedTo__notAllowed(){
        adult = new Visitor(25, 145, 30);
        assertFalse(playground.isAllowedTo(adult));
    }

    @Test
    public void isAllowedTo__allowed(){
        child = new Visitor(4, 90, 0);
        assertTrue(playground.isAllowedTo(child));
    }
}
