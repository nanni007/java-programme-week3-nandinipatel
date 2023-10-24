package week3programs;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
import java.util.Scanner;

public class Program_16_PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scan.nextInt();
        if (num>0){
            System.out.println("The Number is POSITIVE");
        }else if (num<0){
            System.out.println("The Number is NEGATIVE");
        }else {
            System.out.println("The Number is ZERO");
        }
        scan.close();

    }
}
