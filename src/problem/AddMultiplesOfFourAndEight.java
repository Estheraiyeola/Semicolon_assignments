package problem;

public class AddMultiplesOfFourAndEight {
    public static void main(String[] args) {
        int sumTotal = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int num = 1; num <= 10; num++) {
            if (num % 4 == 0) {
                if (num == 4) {
                    int total = 1;
                    int sum = 0;
                    for (int times1 = 0; times1 < 5; times1++) {
                        total = total * num;
                        sum = sum + total;
                    }
                    sum1 = sum;
                }
                else{
                    int total = 1;
                    int sum = 0;
                    for (int times1 = 0; times1 < 5; times1++) {
                        total = total * num;
                        sum = sum + total;
                    }
                    sum2 = sum;
                }
                sumTotal = sum1 + sum2;

            }

        }
        System.out.printf("%d", sumTotal);
    }
}
