package week3programs;
// Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
import java.util.Scanner;

public class Program_8_Alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Alphabet(A to F): ");
        char alphabet = scan.next().charAt(0);
        alphabet = Character.toUpperCase(alphabet);

        String city;
        if (alphabet == 'A') {
            city = "Nairobi";
        } else if (alphabet == 'B') {
            city = "Cape Town";
        } else if (alphabet == 'C') {
            city = "Dar es Salaam";
        } else if (alphabet == 'D') {
            city = "Jaipur";
        } else if (alphabet == 'E') {
            city = "New York";
        } else if (alphabet == 'F') {
            city = "Mumbai";
        } else {
            city = "Invalid Input";
        }
        System.out.println("City Name: " + city);
        scan.close();
    }
}




