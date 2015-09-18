package test;

import java.util.Scanner;

public class ScannerTest {
	static String studentName;
	static String idNumber;
	static String assignmentTitle;
	    static String gradeSheet = "********************************* \n\n" + 
	                                assignmentTitle + "\n\n" +
	                                studentName + " " + idNumber + "\n\n" +
	                                "Grade Summary:\n\n" +
	                                "Program Correctness:        Quality of Style:\n" +
	                                "Late Deduction:              Overall Score:\n" +
	                                "Comments:";
	public static void gradeFormValues()
	{
	    Scanner inData;
	    inData = new Scanner(System.in);
	    System.out.println("Enter student's name: ");
	    studentName = inData.nextLine();
	    System.out.println("Enter student ID number: ");
	    idNumber = inData.nextLine();
	    System.out.println("Enter Assignment title: ");
	    assignmentTitle = inData.nextLine();
	}
	public static void printGradeSheet()
	{
	    System.out.println(gradeSheet);
	}

	public static void main(String[] args)
	{
	            gradeFormValues();
	            printGradeSheet();
	}
}
