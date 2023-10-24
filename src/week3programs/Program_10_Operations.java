package week3programs;
// Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)
import java.util.Scanner;

public class Program_10_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter operation symbol(* - + / )");
        char input = scan.next().charAt(0);

        double result = 0.0;

        if (input == '*') {
            result = num1 * num2;
        } else if (input == '-') {
            result = num1 - num2;
        } else if (input == '+') {
            result = (num1 + num2);
        } else if (input == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Division by 0 is INVALID");
                return;
            }
        } else {
            System.out.println("Invalid Input. Enter correct operation ie. * - + / ");
            return;
        }
        System.out.println("Result: " + result);
        scan.close();
    }
}
