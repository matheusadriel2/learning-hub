package br.com.ispotifai.main;

import br.com.ispotifai.models.Favorite;
import br.com.ispotifai.models.Podcast;
import br.com.ispotifai.models.Song;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("The Kids Aren't Alright");
        song1.setSinger("The Offspring");

        for (int i = 0; i < 19; i++) {
            song1.play();
        }

        for (int i = 0; i < 50; i++) {
            song1.like();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitle("Flow");
        podcast1.setHost("Igor 3K");

        for (int i = 0; i < 25; i++) {
            podcast1.play();
        }

        for (int i = 0; i < 13; i++) {
            podcast1.like();
        }

        Favorite fav = new Favorite();
        fav.include(podcast1);
        fav.include(song1);
    }
}
