import java.util.Arrays;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		// Translate from English to Pig Latin. You will have a loop and call
		// translateWord from here.

		System.out.println("Do you want to translate a word? 'y' or 'n'?");

		String yesOrno = "y";

		while (yesOrno.equals("y")) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a word in English");

			String englishWord = scanner.next();
			// System.out.println(englishWord.toLowerCase()); //Convert each
			// word to lower case before translating

			String piglatinWord = translateWord(englishWord); // Translate word
																// to pig latin
																// word

			System.out.println(piglatinWord);
			System.out.println("Would you like to continue: 'y' or 'n'?");
			yesOrno = scanner.next();

		}

	}

	/**
	 * This method takes any single English word and translates it to a Pig
	 * Latin word.
	 */

	public static String translateWord(String englishWord) {
		String latinWord = "";
		// String word1 = "Hello World";
		String substring1 = "";
		String substring2 = "";

		String lowerCaseWord = englishWord.toLowerCase(); // Convert each word
															// to lower case
															// before
															// translating
		System.out.println(lowerCaseWord);

		char firstLetter = lowerCaseWord.charAt(0);
		//char vowelLetter = lowerCaseWord
		if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
				|| firstLetter == 'u') {
			latinWord = lowerCaseWord.concat("way");
		} else {
			System.out.println("you have entered a word whose first letter is a consonant");
			System.out.println(lowerCaseWord);
			//if entered a consonant, string/store consonant(s) into a variable
			//index through word until find a vowel
			//print vowel plus rest of word, then move all of the consonants that appear before the first vowel to the end of the word
			//then add "ay" to the end of the word
			
			for (int i = 0; i <= lowerCaseWord.length(); i++) {
				System.out.println(lowerCaseWord.charAt(i));
				char nextLetter = lowerCaseWord.charAt(i);
				if (nextLetter == 'a' || nextLetter == 'e' || nextLetter == 'i' || nextLetter == 'o'
					|| nextLetter == 'u') {
						System.out.println(lowerCaseWord.substring(i)); //Print out (nexLetter + rest of word);1
						substring1 = (lowerCaseWord.substring(i));
						
				} else { //store consonants in a variable, append consonants to end of word, then concatenate "ay"
					System.out.println(lowerCaseWord.substring(i));
					substring2 = (lowerCaseWord.substring(i));
					lowerCaseWord = substring1 + substring2; 
					System.out.println(lowerCaseWord);
					latinWord = lowerCaseWord.concat("ay");
						}
			//	System.out.println(lowerCaseWord);
			//	System.out.println(lowerCaseWord.length());
			//	System.out.println(lowerCaseWord.substring(4));
			//	System.out.println(Arrays.asList(lowerCaseWord.split("")));
			//	System.out.println(lowerCaseWord.indexOf('1'));//get -1??
			//	StringBuffer sb = new StringBuffer();
			//	System.out.println(sb);
				
			}
		}
		return (latinWord);

		}
	
}
