package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double ratingSum;
    private int totalRating;
    private int Length;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getLength() {
        return Length;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setLength(int Length) {
        this.Length = Length;
    }

    public void showDatasheet() {
        System.out.printf("""
                Name: %s
                Release year: %d
                """, name, releaseYear);
    }

    public void rate(double r) {
        ratingSum += r;
        totalRating++;
    }

    public double getAverage() {
        return (ratingSum / totalRating);
    }
}
