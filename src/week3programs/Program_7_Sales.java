package week3programs;

import java.util.Scanner;
//Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
//    Sales amount >= 50,000 35%
//    Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%
public class Program_7_Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sales ID: ");
        int salesID = scan.nextInt();
        System.out.println("Enter Seller's Name: ");
        String sellerName = scan.nextLine();
        System.out.println("Enter Sales Value:");
        double salesValue = scan.nextDouble();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scan.nextDouble();
        double commission = 0.0;

        if (salesValue >= 50000) {
            commission = 0.35 * salesValue;
        } else if (salesValue >= 30000) {
            commission = 0.20 * salesValue;
        } else if (salesValue >= 20000) {
            commission = 0.10 * salesValue;
        } else if (salesValue >= 10000) {
            commission = 0.05 * salesValue;
        } else {
            commission = 0.02 * salesValue;
        }
        double totalSalary = basicSalary + commission;
        // Print Sales Commission and Total Salary
        System.out.println("Sales ID " + salesID);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Value: " + salesValue);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Commission: " + commission);
        System.out.println("Total Salary: " + totalSalary);

        scan.close();
    }
}
