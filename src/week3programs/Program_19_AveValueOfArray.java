package week3programs;
// Write a Java program to calculate the average value of array elements.
public class Program_19_AveValueOfArray {
    public static void main(String[] args) {
        double[]numbers = {5.5,7.0,8.0,8.5,10.0};
        double total = 0.0;
        for (double number: numbers){
            total+=number;
        }
        double ave= total/ numbers.length;
        System.out.println("Average: " + ave);
    }
}
