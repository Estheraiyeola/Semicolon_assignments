package problem;

import java.util.Scanner;

import static jdk.internal.joptsimple.internal.Strings.repeat;

public class Asterisks {
    public static void main(String[] args) {
        asterisks();
    }
    public static void asterisks(){
        Scanner input = new Scanner(System.in);
        int variable1 = 0;
        int variable2 = 0;
        int variable3 = 0;
        int variable4 = 0;
        int variable5 = 0;
        for (int count = 1; count <= 5; count++) {
            System.out.print("Enter a number in range 1 to 30: ");
            int number = input.nextInt();

            if (number > 0 && number <= 30) {
                switch (count){
                    case 1 -> variable1  = number;
                    case 2 -> variable2 = number;
                    case 3 -> variable3 = number;
                    case 4 -> variable4 = number;
                    case 5 -> variable5 = number;
                }
            }
        }
        System.out.println("*".repeat(variable1));
        System.out.println("*".repeat(variable2));
        System.out.println("*".repeat(variable3));
        System.out.println("*".repeat(variable4));
        System.out.println("*".repeat(variable5));
    }
}
