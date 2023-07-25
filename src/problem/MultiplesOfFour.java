package problem;

public class MultiplesOfFour {
    public static void main(String[] args) {
        for(int num = 1; num <= 10; num++) {
            if (num % 4 == 0) {
                int total = 1;
                for (int times1 = 0; times1 < 5; times1++) {
                    total = total * num;
                    System.out.printf("%d ", total);
                }
            }
        }
    }
}
