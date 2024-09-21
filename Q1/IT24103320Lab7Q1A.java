import java.util.Scanner;
public class IT24103320Lab7Q1A{
	public static void main (String args[]) {

		Scanner scanner = new Scanner (System.in);

		int mark;
		int total = 0;
		double average;
		String grade;

		System.out.print("Enter mark1: ");
		mark = scanner.nextInt();
		total += mark;

		System.out.print("Enter mark2: ");
		mark = scanner.nextInt();
		total += mark;

		System.out.print("Enter mark3: ");
		mark = scanner.nextInt();
		total += mark;

		System.out.print("Enter mark4: ");
		mark = scanner.nextInt();
		total += mark;


		average = total / 4.0;

		if (average >= 75){
		   grade = "Distinction";
		}

		else if (average >= 50){
		    grade = "Credit";
		}

		else {
		    grade = "Fail";
		}
	
		System.out.println("average is :" + average);
		System.out.println("grade is : " + grade);
		
		  	
			

	}
}