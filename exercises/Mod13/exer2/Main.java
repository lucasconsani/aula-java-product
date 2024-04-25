import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.CompletionException;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        Post post1 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow",5);

        post.addComments(c1);
        post.addComments(c2);
        post1.addComments(c3);
        post1.addComments(c4);

        System.out.println(post);
        System.out.println(post1);

    }

}