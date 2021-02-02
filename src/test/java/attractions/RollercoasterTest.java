package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedTo__allowed(){
        Visitor adult = new Visitor(25, 145, 30);
        assertTrue(rollerCoaster.isAllowedTo(adult));
    }

    @Test
    public void isAllowedTo__notAllowed(){
        Visitor child = new Visitor(4, 90, 0);
        assertFalse(rollerCoaster.isAllowedTo(child));
    }

    @Test
    public void canTicket__short(){
        Visitor adult = new Visitor(25, 145, 30);
        double price = rollerCoaster.priceForVisitor(adult);
        assertEquals(8.40, price, 0.0);
    }

    @Test
    public void canTicket__tal(){
        Visitor tallGuy = new Visitor(25, 500, 40);
        double price = rollerCoaster.priceForVisitor(tallGuy);
        assertEquals(16.80, price, 0.0);
    }
}
