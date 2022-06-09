package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Application {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2  = new Comment("Wow that's awesome !");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to new Zealands", "I m goingto visit this worderful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("God Night");
		Comment c4  = new Comment("May the force be with you");
		Post p2 = new Post(sdf.parse("09/06/2022 16:34:00"), "God night people", "se you tomorrow", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
