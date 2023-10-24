package week3programs;
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
//    HRA = basic salary 10%
//    DA = Basic salary 8%
//    TA = Basic salary 9%
//    PF= Basic salary 20%
//    Gross salary = basic salary + HRA + TA + DA –PF
import java.util.Scanner;

public class Program_5_SalarySlip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int employeeID = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Employee Name: ");
        String employeeName= scan.nextLine();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scan.nextDouble();
        double hra = 0.10* basicSalary;
        double ta = 0.08* basicSalary;
        double da = 0.09*basicSalary;
        double pf=0.02*basicSalary;
        double grossSalary=basicSalary+ hra+ta+da+pf;

        //Print Salary Slip
        System.out.println("--------------------------------------");
        System.out.println("|             SALARY SLIP            |");
        System.out.println("|------------------------------------|");
        System.out.println("|  Employee ID :   "  + employeeID +"                |");
        System.out.println("|  Employee Name:  "  + employeeName+"           |");
        System.out.println("|------------------------------------|");
        System.out.println("|  Basic Salary :  "  + basicSalary+"           |");
        System.out.println("|  HRA 10%      :  "  + hra        +"            |");
        System.out.println("|  TA  8%       :  "  + ta         +"            |");
        System.out.println("|  DA  9%       :  "  + da         +"            |");
        System.out.println("|  PF  20%      :  "  + pf         +"            |");
        System.out.println("|------------------------------------|");
        System.out.println("|  Gross Salary :  "  + grossSalary+"          |");
        System.out.println("|====================================|");

        scan.close();
    }
}
