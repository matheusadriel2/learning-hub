package br.com.alura.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public Series(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    private int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodesPerSeason(int episodes) {
        this.episodesPerSeason = episodes;
    }

    public void setMinutesPerEpisode(int minutes) {
        this.minutesPerEpisode = minutes;
    }

    @Override
    public int getLength() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }
}
