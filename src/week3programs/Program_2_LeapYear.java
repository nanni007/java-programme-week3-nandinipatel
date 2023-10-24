package week3programs;
//Write a java program to input any year like (ex.2007) and find out if it is leap year or
//not
import java.util.Scanner;

public class Program_2_LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scan.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 !=0)||(year % 400 == 0);
        if (isLeapYear){
            System.out.println( year + " is a Leap Year.");
        }else {
            System.out.println(year + " is not a Leap Year.");
        }
        scan.close();
    }
}
