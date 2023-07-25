package problem;

public class Print4And8 {
    public static void main(String[] args) {
        for(int numbers = 1; numbers <= 10; numbers++){
            if(numbers % 4 == 0 && numbers != 8){
                System.out.printf("%d, ", numbers);
            }
            if (numbers == 8){
                System.out.printf("%d", numbers);
            }
        }
    }
}
