import br.com.alura.screenmatch.calculation.RecommendationFilter;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Jurassic Park");
        myMovie.setReleaseYear(1993);
        myMovie.setLength(127);
        myMovie.setIncludedInPlan(true);

        myMovie.showDatasheet();
        myMovie.rate(10);
        myMovie.rate(8);
        myMovie.rate(3);
        System.out.printf("Total rating: %d\nRating average: %.1f\n\n", myMovie.getTotalRating(), myMovie.getAverage());

        Series serie1 = new Series();
        serie1.setName("Game of Thrones");
        serie1.setReleaseYear(2011);
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
    }
}
