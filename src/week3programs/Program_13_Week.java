package week3programs;
//Write a Java program which input any number between 1 to 7 and it print The Days
//name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
import java.util.Scanner;

public class Program_13_Week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 & 7: ");
        int daynumber = scan.nextInt();
        String dayName;
        switch (daynumber) {
            case 1:
                dayName = "MONDAY";
                break;
            case 2:
                dayName = "TUESDAY";
                break;
            case 3:
                dayName = "WEDNESDAY";
                break;
            case 4:
                dayName = "THURSDAY";
                break;
            case 5:
                dayName = "FRIDAY";
                break;
            case 6:
                dayName = "SATURDAY";
                break;
            case 7:
                dayName = "SUNDAY";
                break;
            default:
                dayName = "Week contains only 7 days";
                break;
        }
        System.out.println("Day of the week: " + dayName);
        scan.close();
    }
}
