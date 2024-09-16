package br.com.ispotifai.models;

public class Audio {
    private String title;
    private int totalPlays;
    private int totalLikes;
    private int rating;

    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalPlays++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }
}
