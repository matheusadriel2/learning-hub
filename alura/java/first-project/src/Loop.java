import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate =  0;
        double average = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("What rate do you give for this movie?");
            rate = scanner.nextDouble();
            average += rate;
        }
        System.out.printf("Rating average: %.1f", average/3);
    }
}
