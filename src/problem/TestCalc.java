package problem;

import java.util.Scanner;


public class TestCalc{


	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enterthe first number: ");
		int int1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int int2 = input.nextInt();
		int sum1 = int1 + int2 ;
		System.out.println(sum1);
		
		System.out.print("Enter the third number: ");
		int int3 = input.nextInt();
		
		int sum = int1 + int2 + int3;
		
		System.out.print(sum);
	
	}

}

