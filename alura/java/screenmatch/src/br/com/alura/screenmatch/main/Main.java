package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculation.RecommendationFilter;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Jurassic Park", 1993);
        myMovie.setLength(127);
        myMovie.setIncludedInPlan(true);
        myMovie.showDatasheet();
        myMovie.rate(10);
        myMovie.rate(8);
        myMovie.rate(3);
        System.out.printf("Total rating: %d\nRating average: %.1f\n\n", myMovie.getTotalRating(), myMovie.getAverage());

        Movie movie2 = new Movie("Alien", 1979);
        movie2.setLength(116);
        movie2.setIncludedInPlan(true);
        movie2.showDatasheet();
        movie2.rate(10);
        System.out.printf("Rating: %.1f\n\n", movie2.getAverage());

        Series serie1 = new Series("Game of Thrones", 2011);
        serie1.setSeasons(8);
        serie1.setEpisodesPerSeason(10);
        serie1.setMinutesPerEpisode(50);
        serie1.showDatasheet();
        System.out.printf("Length: %d\n", serie1.getLength());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(serie1);
        episode.setTotalViews(1000000);
        filter.filter(episode);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(movie2);
        System.out.println(movieList.size());
        System.out.println(movieList.getFirst().getName());
        System.out.println(movieList.getFirst().toString());
    }
}
