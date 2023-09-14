package technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class LaptopTest {

    Laptop macbook = new Laptop();
    Laptop lenovo = new Laptop("Lenovo", true, "USB cable", true);

    @Test
    public void testLaptopConstructorWithNoGivenFields() {
        String msg = "The laptop constructor sets fields when no arguments given.";
        String expected = "ID: " + macbook.getId() + " The Apple device comes with a lightning cord for charging.";
        String actual = macbook.toString();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void testLaptopConstructorWhenGivenAllFields() {
        String msg = "The constructor sets fields when using default constructor.";
        String expected = "ID: " + lenovo.getId() + " The Lenovo device comes with a USB cable for charging.";
        String actual = lenovo.toString();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void closeLaptopMethodReturnsStatement() {
        String msg = "The close laptop method returns a confirmation statement.";
        String expected =  "The Lenovo laptop has been closed.";
        String actual = lenovo.closeLaptop();
        assertEquals(expected, actual, msg);
    }
}
