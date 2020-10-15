import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/15/2020
 * Time: 2:11 PM
 */
class NextDayCalculatorTest {

    @Test
    @DisplayName("1/1/2018")
    void getNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        String expected = "2/1/2018";
        String actual = NextDayCalculator.getNextDayOfMonth(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("31/1/2018")
    void getNextDay31() {
        int day = 31;
        int month = 1;
        int year = 2018;

        String expected = "1/2/2018";
        String actual = NextDayCalculator.getNextDayOfMonth(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("30/4/2018")
    void getNextDay30() {
        int day = 30;
        int month = 4;
        int year = 2018;

        String expected = "1/5/2018";
        String actual = NextDayCalculator.getNextDayOfMonth(day, month, year);

        assertEquals(expected, actual);
    }
}