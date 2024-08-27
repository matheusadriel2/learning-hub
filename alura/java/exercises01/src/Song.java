public class Song {
    String title;
    String artist;
    int releaseYear;
    double rate;
    double rateNum;

    void Datasheet() {
        System.out.printf("""
                
                +===+===+===+
                Title: %s
                Artist: %s
                Release year: %d
                +===+===+===+
                """, title, artist, releaseYear);
    }
}
