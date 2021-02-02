package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);
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
    public void hasRating(){
        assertEquals(3, tobaccoStall.getRating());
    }

    @Test
    public void isAllowedTo__allowed(){
        Visitor adult = new Visitor(25, 145, 30);
        assertTrue(tobaccoStall.isAllowedTo(adult));
    }

    @Test
    public void isAllowedTo__notAllowed(){
        Visitor child = new Visitor(4, 90, 0);
        assertFalse(tobaccoStall.isAllowedTo(child));
    }
}
