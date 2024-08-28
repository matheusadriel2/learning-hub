public class Conditional {
    public static void main(String[] args) {
        String movieName = "Jurassic Park";
        int releaseYear = 2024;
        double rating = 8.2;
        boolean includedInPlan = true;
        boolean isClientPlus = true;

        if (releaseYear >= 2024) {
            System.out.println("BLOCKBUSTER!");
        } else {
            System.out.println("Retro movie..");
        }

        if (includedInPlan == true && isClientPlus == true) {
            System.out.println("WATCH NOW!");
        } else {
            System.out.println("WATCH NOW! But you have to pay first..");
        }
    }
}
