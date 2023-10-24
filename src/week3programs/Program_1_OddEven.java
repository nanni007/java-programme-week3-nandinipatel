package week3programs;
//Write a java program that tells us that Input number is odd or even?
import java.util.Scanner;

public class Program_1_OddEven {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        String Output = (number % 2 == 0)? "Even" : "Odd";
        System.out.println("The number entered is: " + Output);
        scan.close();
    }

}
