package Lab15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * <a
 * 
 * @author Yolanda Gandy, ExperienceIT
 * 
 *         Lab 15: Create an app that prompts users to read and write a list of
 *         counties to an external file. This class stores the methods used to
 *         read and write to the external file.
 */

public class CountriesTextFile {

	/** Create a file path in order to store a list of countries. */
	private Path filePath;

	/**
	 * Constructor that lets you choose a file path.
	 * 
	 * @param filePathString
	 *            path of the file where the country list is stored.
	 */
	public CountriesTextFile(String filePathString) {
		this.filePath = Paths.get(filePathString);
	}

	/**
	 * Constructor that uses the default file path to store trucks.
	 */
	public CountriesTextFile() {
		this("src/co/grandcircus/fileio/countries.txt");
	}

	/**
	 * Read the file and return the countries listed in the file.
	 * 
	 * @return A List of countries. If the file does not exist, it will return an empty list. 
	 * At the end of the file, it will return a null value.
	 * @throws RuntimeException if error accessing the file.
	 */
	
	public List<String> readCountriesTextFile() {
	}

	public List<String> readCountryList() {
		// TODO Auto-generated method stub
		return null;
	}
	
		List<String> countries = new ArrayList<>();
		if (!Files.exists(filePath)) {
			return countries;
		}
		
		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
		 
			String line = reader.readLine();
			while (line != null) {
				countries.add(line);
				line = reader.readLine();
			}
			
			reader.close();
			return countries;
			
		} catch (IOException ex) {
			throw new RuntimeException("Unable to read counfries file.", ex);
		  }

	/**
	 * Writes a list of trucks to the file.
	 * 
	 * @param Countries List -  The list of countries to write.
	 * @throws RuntimeException if error accessing the file
	 */
	
	public void countries(List<String> countries) {
	
		try {
			if (!Files.exists(filePath)) {
				Files.createFile(filePath);
			}
			
			File file = filePath.toFile();
			PrintWriter writer = new PrintWriter(file);
			
			for (String country : countries) {
				writer.println(country);
}
	
	writer.close();		

}

