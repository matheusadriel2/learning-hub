package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Jurassic Park", 1993);
        movie1.rate(10);
        Movie movie2 = new Movie("Alien", 1979);
        movie2.rate(10);
        Movie movie3 = new Movie("Harry Potter", 2001);
        movie3.rate(8);
        Series serie1 = new Series("Game of Thrones", 2011);
        serie1.rate(8);

        ArrayList<Title> list = new ArrayList<>();
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        list.add(serie1);

        for (Title item : list) {
            System.out.println(item);
            if (item instanceof Movie movie) {
                System.out.printf("Rating: %.1f\n\n", movie.getRatingSum() );
            }
        }
    }
}
