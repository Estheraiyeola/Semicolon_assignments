package problem;

public class Print4And8MultipleTimes {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++){
            for (int rep = 0; rep < 5; rep++)
                if (num % 4 == 0){
                    System.out.printf("%d ", num);


            }
        }
    }
}
