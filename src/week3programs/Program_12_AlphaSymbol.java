package week3programs;
// Write a program that tells us input value is number or an alphabet or symbol.
import java.util.Scanner;

public class Program_12_AlphaSymbol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char input = scan.next().charAt(0);
        scan.close();

        if (Character.isDigit(input) ){
            System.out.println("Input is a Number.");
        }else if (Character.isLetter(input)){
            System.out.println("Input is an Alphabet");
        }else {
            System.out.println("Input is a Symbol");
        }
    }
}
