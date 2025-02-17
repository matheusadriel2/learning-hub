import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your favorite movie?");
        String movie = scanner.nextLine();
        System.out.println("What year this movie was released?");
        int releaseYear = scanner.nextInt();
        System.out.println("What rate do you give for this movie?");
        double rating = scanner.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(rating);
    }
}
