

//create static method to estimate rolls of dice.
	// use Math.random(); Copy and paste then make a new
	// lab5_1 and use another method such as java.util.random
	// use same code except change return values
	// Method has to be outside of main method. Yet both have to be inside the
	// class Lab5

import java.util.Scanner;


public class Lab5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Circus City! Would you like to play Roll the Die? 'y' or 'n'");
		
		String yesOrno = "y";

		while (yesOrno.equalsIgnoreCase("y")) {

			System.out.println("Please enter how many sides on your die:");
			int noSides = scanner.nextInt();
			System.out.println(noSides);

			for (int i = 1; i <= noSides; i++) {
				System.out.println();		
			
			int dieOutcome = rollADie(noSides);// hard code six in beginning to get it to
			System.out.println(dieOutcome); // run once
			}
		// Ask User if they want to continue? Enter "y" or "n"

		System.out.println("Would you like to continue: 'y' or 'n'?");
		yesOrno = scanner.next();
		
		}
		
		System.out.println("Goodbye!");
		scanner.close();
	}
	
	public static int rollADie(int dieOutcome) {
		int randomAnswer =  (int)(Math.random() * 10+1);			
					System.out.println(randomAnswer);
					return randomAnswer;// hard code temporary number so program will run
	}
		
}
