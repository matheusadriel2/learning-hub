package br.com.ispotifai.models;

public class Favorite {

    public void include(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " is PEAK!");
        } else {
            System.out.println(audio.getTitle() + " good");
        }
    }
}
