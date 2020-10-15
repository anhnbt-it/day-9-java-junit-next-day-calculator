/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/15/2020
 * Time: 2:07 PM
 */
public class NextDayCalculator {
    /*
     * input: month: int, year: int
     * output: lastDayOfMonth: int
     */
    public static int getLastDayOfMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return 31;
    }

    public static String getNextDayOfMonth(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        if (day == getLastDayOfMonth(month, year)) {
            nextDay = 1;
            nextMonth++;
        } else {
            nextDay++;
        }
        return nextDay + "/" + nextMonth + "/" + year;
    }
}
