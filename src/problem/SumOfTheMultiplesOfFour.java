package problem;

public class SumOfTheMultiplesOfFour {
    public static void main(String[] args) {
        for(int num = 1; num <= 10; num++) {
            if (num % 4 == 0) {
                if (num == 4) {
                    int total = 1;
                    int sum = 0;
                    for (int times1 = 0; times1 < 5; times1++) {
                        total = total * num;
                        sum = sum + total;
                    }
                    System.out.printf("%d ", sum);
                }
                else{
                    int total = 1;
                    int sum = 0;
                    for (int times1 = 0; times1 < 5; times1++) {
                        total = total * num;
                        sum = sum + total;
                    }
                    System.out.printf("%d ", sum);
                }
            }
        }
    }
}
