package week3programs;
//Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
// If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
import java.util.Scanner;

public class Program_3_MarkSheet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String studentName = scan.nextLine();
        System.out.println("Enter Student Roll Number: ");
        int studentRollNo = scan.nextInt();
        System.out.println("Enter Student Maths Marks: ");
        int mathMarks = scan.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        System.out.println("Enter Student Science Marks: ");
        int sciMarks = scan.nextInt();
        if (sciMarks < 0 || sciMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        System.out.println("Enter Student English Marks: ");
        int engMarks = scan.nextInt();
        if (engMarks < 0 || engMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        int totalMarks = mathMarks + sciMarks + engMarks;
        float percentage = (float) ((totalMarks / 300.0) * 100);
        String result = (percentage >= 35) ? "Pass" : "Fail";

        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "D";
        }

        //Printing Mark Sheet
        System.out.println("----------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|              MARK SHEET              |");
        System.out.println("|                                      |");
        System.out.println("|--------------------------------------|");
        System.out.println("|      Name:" + studentName + "                    |");
        System.out.println("|      Roll No:  " + studentRollNo + "                    |");
        System.out.println("|--------------------------------------|");
        System.out.println("|      Subjects     |     Marks        |");
        System.out.println("|       Maths       :"      + mathMarks + "                |");
        System.out.println("|       Science     :"      + sciMarks + "                |");
        System.out.println("|       English     :"      + engMarks + "                |");
        System.out.println("|--------------------------------------|");
        System.out.println("|       Total       :" + totalMarks + "               |");
        System.out.println("|       Percentage  :" + percentage + "              |");
        System.out.println("|       Result      :" + result + "              |");
        System.out.println("|       Grade       :" + grade + "                 |");
        System.out.println("|--------------------------------------|");
        scan.close();

    }
}




