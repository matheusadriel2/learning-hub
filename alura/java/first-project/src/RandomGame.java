import java.util.Scanner;
import java.util.Random;
public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(100);
        int kick = 0;
        System.out.println(random);

        for (int i = 1, j = 4; i <= 5; i++, j--) {
            final String attemptW = j > 1
                    ? "attempts"
                    : "attempt";
            System.out.println("Try to find the random number (1 to 100): ");
            kick = scanner.nextInt();
            if (kick == random) {
                System.out.println("FUCK YEA!");
            } else if (kick > random) {
                System.out.printf("Too high. %d %s left.\n", j, attemptW);
            } else {
                System.out.printf("Too low. %d %s left.\n", j, attemptW);
            }
        }

    }
}
