package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canTicket__adult(){
        Visitor adult = new Visitor(25, 145, 30);
        double price = dodgems.priceForVisitor(adult);
        assertEquals(4.50, price, 0.0);
    }

    @Test
    public void canTicket__child(){
        Visitor child = new Visitor(4, 90, 0);
        double price = dodgems.priceForVisitor(child);
        assertEquals(2.25, price, 0.0);
    }
}
