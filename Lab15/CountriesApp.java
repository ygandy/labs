package Lab15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

//import java.nio.file.Files;
//import java.nio.file.*;
//import java.nio.file.Path;
//import java.nio.file.Paths;
/**
 * 
 * @author Yolanda Gandy - ExperienceIT All Stars, Lab15
 * 
 * Purpose: Maintain a list of countries
 * 
 * Show user a menu with three options
 * If the user chooses option 1, display a list of countries that have been saved in a file.
 * If the user chooses option 2, prompt the user to enter a country and then write the country and then write the country to the file of countries.
 * If the user chooses option 3, display a goodbye message and exit.
 */

public class CountriesApp{
	
	public static void main(String[] args)throws IOException {
	
		System.out.println("Welcome to the Countries Maintenance Application!");
		
		/** Create new instance of Countries Text File in order to list countries for option #1 */
		
		CountriesTextFile  countriesTextFile = new  CountriesTextFile();
		
		/**	Create a new instance of country ArrayList in order to store User input for option #2 */
	
		String addCountry;
		List<String>  country = new  ArrayList<String>();
		  
		Scanner sc = new Scanner(System.in);
		System.out.println("1. List of countries:");
		System.out.println("2. Add a country");
		System.out.println("3. Exit");
		
		int userMenuChoice = sc.nextInt();	
		
		switch(userMenuChoice){
		
		case 1: country = countriesTextFile.readCountryList();
			System.out.println(country);
			break;
			
		 case 2 :System.out.println("Enter Country");
		 
			 addCountry = sc.next();
			 country.add(addCountry);
			// countriesTextFile.writeCountriesList(country);
			 System.out.println("This country has been saved! ");
			 System.out.println();
		 break;
		 case 3 :System.out.println("Exit");
		 
		 break;
		 
		 default: System.out.println("Wrong input.Please enter from 1 to 3");
			
		}//end switch case
		
		
		
		
		
	}//end main
}//end countriesApp class

		
		