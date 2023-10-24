package week3programs;
//Write a java program to input any number and find out if it’s odd or even
import java.util.Scanner;

public class Program_6_OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        if (number % 2==0){
            System.out.println(number + " is an Even Number.");
        }else{
            System.out.println(number + " is an Odd Number.");
        }
        scan.close();
    }


}
