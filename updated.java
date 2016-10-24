package co.grandcircus.studentlist;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
	String name= null;
	String category= null;
    Movie movie = new Movie(name,category);
	ArrayList<Movie> list = new ArrayList<Movie>();
	list.add(new Movie("frozen","animation"));
	list.add(new Movie("wall-e","animation"));
	list.add(new Movie("ice age","animation"));
	list.add(new Movie("concussion","drama"));
	list.add(new Movie("pursuit of happyness","drama"));
	list.add(new Movie("ring","horror"));
	list.add(new Movie("conjuring","horror"));
	list.add(new Movie("texas chainsaw","horror"));
	list.add(new Movie("bridesmaid","comedy"));
	list.add(new Movie("coming to america","comedy"));
	    
	    System.out.println(list);
		System.out.println("Welcome to the movie list application");
		System.out.println("There are 100 movies in the list.What category are you interested in ?");
		String userInput = scanner.next();
		
	
	
	
	
	
	
	
	
	


	
	}//end of public class

}// end of main
