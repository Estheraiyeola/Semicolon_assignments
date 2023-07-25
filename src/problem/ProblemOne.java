package problem;

import java.util.Scanner;

public class ProblemOne{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int gradeCounter = 0;
		int total = 0;
		
		System.out.print("Enter the score and enter -1 if there's no number: ");
		int grade = input.nextInt();
		
		while(grade != -1){
		
			total += grade;
			gradeCounter += 1;
			
			System.out.print("Enter the score and enter -1 if there's no number: ");
			grade = input.nextInt();
			
		}
		if (gradeCounter != 0){
			double average = (double)total / gradeCounter;
			
			System.out.printf("The total of all the grades collected is %d%n", total);
			System.out.printf("The class average is %.2f%n", average);
		}
		else{
			System.out.print("No grades were entered!!🤔️");
		}
		
		
	}
}
