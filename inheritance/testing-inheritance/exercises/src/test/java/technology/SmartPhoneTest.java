package technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SmartPhoneTest {

    SmartPhone iphone = new SmartPhone();
    SmartPhone android = new SmartPhone("Google", true, "Micro USB cord", "Android");

    @Test
    public void testSmartPhoneConstructorWhenNoGivenFields() {
        String msg = "The smartphone constructor sets fields when no fields given";
        String expected = "ID: " + iphone.getId() + " The Apple device comes with a lightning cord for charging.";
        String actual = iphone.toString();
        assertEquals(expected, actual, msg);
    }

    @Test
    public void testSmartPhoneConstructorWhenGivenAllFields() {
        String msg = "The smartphone constructor sets fields when all fields given.";
        String expected = "ID: " + android.getId() + " The Google device comes with a Micro USB cord for charging.";
        String actual = android.toString();
        assertEquals(expected, actual, msg);

    }

    @Test
    public void isRingingMethodReturnsStatement() {
        String msg = "The smartphone is ringing method returns a confirmation statement.";
        String expected = "The Google smartphone is ringing!";
        String actual = android.isRinging();
        assertEquals(expected, actual, msg);
    }

}
