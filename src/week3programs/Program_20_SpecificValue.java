package week3programs;
//Write a Java program to test if an array contains a specific value.
public class Program_20_SpecificValue {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int targetValue = 6;
        boolean found = false;
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array contains the value " + targetValue);
        }
    }
}
