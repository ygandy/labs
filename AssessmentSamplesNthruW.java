//Week 6 Assessment N thru W (Author Yolanda Gandy)

package Week6Assessment;

import java.util.ArrayList;

public class AssessmentSamplesNthruW {
//public class ErrorsN {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("The LEGO Movie", "awesome"));
        movies.add(new Movie("Finding Nemo", "cartoon"));

        // Print out all the movie titles
        for (Movie movie: movies) {//for the new instance of object Movie give me each movie from the ArrayList movies variable
            System.out.println(movie.getTitle());//use the getTitle method from new Movie object
        }
//************************************************************************************
    }//end main

}//end class
//*************************************************************************************
//Errors N: Movie movies = new ArrayList<Movie>(); should be 
//			ArrayList<Movie> movies = new ArrayList<Movie>();
//Errors O: ArrayList<String> movies = new ArrayList<String>() should be
//			ArrayList<Movie> movies = new ArrayList<Movie>();
//Errors P: movies.add("The LEGO Movie", "awesome");movies.add("Finding Nemo", "cartoon");
//			should be movies.add(new Movie("The LEGO Movie", "awesome")) etc.
//Errors Q: System.out.println(movie)should be System.out.println(movie.getTitle).
//			prints out Week6Assessment.Movie@15db9742 and .Movie@6d06d69c which are....the address of each of these movies in the array movies?
//Errors R: for (ArrayList<Movie> movie : movies) should be for (Movie movie: movies)//for each movie from the movies array variable
//
//Errors S: for (Movie movies : movies) should be Movie movie: movies and (movies.getTitle()) should be movie.getTitle for each movie
//
//Errors T: ArrayList<Movie> movies = new ArrayList<Movie> is missing the parms ().  
//			should be ArrayList<Movie> movies = new ArrayList<Movie>();
//Errors U: for (movies) should be for (Movie movie: movies)
//
//Errors V: System.out.println(getTitle()) should be changed to (movie.getTitle()) to call the method getTitle using the new instance variable movie
//			can't be Movie.getTitle because this is a class variable and would have to be static
//
//Errors W: movie.getTitle() will just get the movie Title. Have to add System.out.println in order for it to print to console