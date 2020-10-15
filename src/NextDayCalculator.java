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
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
        }
        return 31;
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public static String getNextDayOfMonth(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        if (day == getLastDayOfMonth(month, year)) {
            nextDay = 1;
            if (month == 12) {
                nextMonth = 1;
                nextYear++;
            } else {
                nextMonth++;
            }
        } else {
            nextDay++;
        }
        return nextDay + "/" + nextMonth + "/" + nextYear;
    }
}
