package problem;

public class PrintOddNumbers {
    public static void main(String[] args) {
        for (int numbers = 1; numbers <= 10; numbers++){
            if (numbers % 2 == 1 && numbers != 9){
                System.out.printf("%d, ", numbers);
            }
            if (numbers == 9){
                System.out.printf("%d", numbers);
            }
        }
    }
}
