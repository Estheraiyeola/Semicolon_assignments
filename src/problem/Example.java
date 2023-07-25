package problem;

public class Example{
	public static void main(String[] args){
		int x = 7;
		int y = 3;
		
		x = y++;
		System.out.printf("The value of x is : %d%n", x);
		
		x = ++y;
		System.out.printf("The value of x is : %d%n", x);	
	}
}
