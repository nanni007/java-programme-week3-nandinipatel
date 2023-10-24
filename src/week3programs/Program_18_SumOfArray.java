package week3programs;
// Write a Java program to sum values of an array.
public class Program_18_SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int a = 0; a < numbers.length; a++) {
            sum += numbers[a];
        }
        System.out.println("Sum of the array elements: " + sum);
    }
}
