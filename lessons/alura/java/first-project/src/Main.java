public class Main {
    public static void main(String[] args) {
        int releaseYear = 1993;
        boolean includedInPlan = true;
        double average = (9.8 + 6.3 + 8.0) / 3;
        int rating = (int) (average / 2);
        String plot = "A pragmatic paleontologist touring an almost complete theme park on an island in Central" +
                "America is tasked with protecting a couple of kids after a power failure causes the parks cloned" +
                "dinosaurs to run loose.";

        System.out.println("This is Stremax");
        System.out.printf("Movie: Jurassic Park (%d)\n", releaseYear);
        System.out.println(rating);
        System.out.println(plot);
    }
}