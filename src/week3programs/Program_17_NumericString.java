package week3programs;
// Write a Java program to sort a numeric array and a string array.
import java.lang.reflect.Array;
import java.util.Arrays;

public class Program_17_NumericString {
    public static void main(String[] args) {
        int [] numberArray = {9,3,1,7,5};
        Arrays.sort(numberArray);
        System.out.println("Sorted Number Array is: " + Arrays.toString(numberArray));

    }
}
