package week3programs;
//Same as above program-8 using switch statement
import java.util.Scanner;

public class Program_9_AlphabetSwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Alphabet (A to F): ");
        char alphabet = scan.next().charAt(0);
        alphabet = Character.toUpperCase(alphabet);
        switch (alphabet) {
            case 'A':
                System.out.println("City Name: Ahmedabad");
                break;
            case 'B':
                System.out.println("City Name: Birmingham");
                break;
            case 'C':
                System.out.println("City Name: Cardiff");
                break;
            case 'D':
                System.out.println("City Name: Durham");
                break;
            case 'E':
                System.out.println("City Name: Eindhoven");
                break;
            case 'F':
                System.out.println("City Name: Fiji");
                break;
            default:
                System.out.println("Invaid Input. Enter ALphabet between A to F.");

        }
        scan.close();
    }
}
