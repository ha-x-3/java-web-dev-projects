package technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    Computer computer1 = new Computer();
    Computer computer2 = new Computer("Dell", true, "USB cable");

    @Test
    public void testConstructorWhenGivenNoFields() {
        String msg = "The constructor sets fields when no arguments given.";
        String expected = "ID: " + computer1.getId() + " The Apple device comes with a lightning cord for charging.";
        String actual = computer1.toString();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void testConstructorWhenGivenAllFields() {
        String msg = "The constructor sets fields when using default constructor.";
        String expected = "ID: " + computer2.getId() + " The Dell device comes with a USB cable for charging.";
        String actual = computer2.toString();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void turnOffMethodReturnsStatement() {
        String msg = "The turn off method returns confirmation statement.";
        String expected = "The Apple device has been turned off.";
        String actual = computer1.turnOff();
        assertEquals(expected, actual, msg);
    }
}
