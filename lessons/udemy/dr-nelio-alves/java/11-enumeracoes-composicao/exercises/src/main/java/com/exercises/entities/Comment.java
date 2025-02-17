package main.java.com.exercises.entities;

public class Comment {
    private String text;

    public Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text + "\n";

    }
}
