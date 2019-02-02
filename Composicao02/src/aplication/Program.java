package aplication;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice Trip");
        Comment c2 = new Comment("Wow, that's awesome");
        Post p1 = new Post(sdf.parse("21/06/2019 11:54:00"),
                "Taveling to new Zeland",
                "I'm going to visity this wonderful country!",
                12);
        p1.AddComment(c1);
        p1.AddComment(c2);


        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");
        Post p2 = new Post(sdf.parse("20/06/2015 05:08:00"),
                "Good night guys",
                "See you tomorrow!",
                5);
        p2.AddComment(c3);
        p2.AddComment(c4);

        System.out.println(p1);
        System.out.println(p2);

    }
}
