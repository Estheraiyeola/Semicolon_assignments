package problem;

import java.util.Scanner;

public class ProblemTwo{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		int studentFailed = 0;
		int studentPassed = 0;
		int students = 1;
		
		while (students <= 10){
			System.out.print("Enter the sacred number: ");
			int number = input.nextInt();
			
			if (number == 1){
				studentPassed += 1;
			}
			else{
				studentFailed += 1;
			}
			students += 1;
		}
		if (studentPassed >= 8){
			System.out.print("Bonus to the teacher");
		}
		else{
			System.out.print("😏️");
		}
	}
}
