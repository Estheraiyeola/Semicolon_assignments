package problem;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        for(int numbers = 1; numbers <= 10; numbers++){
            if (numbers % 2 == 0 && numbers != 10){
                System.out.printf("%d, ", numbers);
            }
            if (numbers == 10){
                System.out.printf("%d", numbers);
            }

        }
    }
}
