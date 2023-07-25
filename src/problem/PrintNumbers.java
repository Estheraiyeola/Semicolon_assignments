package problem;

public class PrintNumbers {
    public static void main(String[] args) {
        for (int numbers = 1; numbers <= 10; numbers++){
            if(numbers != 10)
                System.out.printf("%d, ", numbers);
            else if(numbers == 10){
                System.out.printf("%d", numbers);
            }
        }
    }
}
