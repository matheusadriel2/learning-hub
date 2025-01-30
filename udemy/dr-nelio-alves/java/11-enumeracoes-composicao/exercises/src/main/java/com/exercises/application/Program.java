package main.java.com.exercises.application;

import main.java.com.exercises.entities.Comment;
import main.java.com.exercises.entities.Post;

import java.text.ParseException;
import java.time.LocalDateTime;
import static main.java.com.exercises.entities.Post.fmt1;

public class Program {
    public static void main(String[] args) throws ParseException {

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(
                LocalDateTime.from(fmt1.parse("20/07/2022 01:30")),
                "Traveling to New York",
                "I'm going to visit this wonderful country!",
                12
        );
        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1);

    }
}
