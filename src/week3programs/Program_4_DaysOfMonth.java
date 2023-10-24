package week3programs;
//Write a method isLeapYear with a parameter of type int named year.
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
//otherwise return false.
//A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
public class Program_4_DaysOfMonth {
    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));  // false
        System.out.println(isLeapYear(1600));   // true
        System.out.println(isLeapYear(2017));   // false
        System.out.println(isLeapYear(2000));   // true

        System.out.println(getDaysInMonth(2, 2022));   // 28
        System.out.println(getDaysInMonth(2, 2000));   // 29
        System.out.println(getDaysInMonth(4, 2022));   // 30
        System.out.println(getDaysInMonth(9, 2022));   // 30
        System.out.println(getDaysInMonth(12, 2022));  // 31
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year) && month == 2) {
            return 29;
        } else {
            return daysInMonth[month];
        }
    }
}

