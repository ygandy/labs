import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		//String number;
		// int studentIndex = scanner.nextInt();
		int studentIndex = 0;

		String[] name = { "Kim", "Mark", "James", "Yolanda", "Taneka", "Kimmy", "Marky", "Jamesey", "Yo", "Tan", "Kimbo", "Marko", "Jameo", "Yolando", "Tanekao", "Kimie", "Markie", "Jamie", "Yolandie", "Tanekie"};
		String [] hometown = {"Detroit", "Flint", "Taylor", "Ypsilanti", "Ann Arbor"};
		String [] favFood = {"Pizza", "Tacos", "HotDogs", "Chilli",
		"Chicken"};

		for (int i = 0; i < 20; i++) {
			System.out.println((i + 1) + " " + name[i]);
		} // end of for loop to print out list of student names
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome to Grand Circus. Who would you like to learn more about?");
		System.out.println("Enter a number");
		String userInput = scanner.next();
		
		int number = Integer.parseInt(userInput);
		//scanner.close();
		
		String choice =("y");
		String answer = "";
		
			
		while (true) {
			System.out.println("Enter a number between 1 and 20");
			try {
				number = scanner.nextInt();
				
				if (number < 1 || number > 4) {
					// the number is not good
					System.out.println("That number is not in the range.");
				} else {
					break; // the number is valid
				}
			} catch (InputMismatchException e) {
				System.out.println("You did not enter a number.");
				scanner.next();
				continue;
			}
			
			scanner.nextLine();
			
	
	//student 4 is Yolanda Gandy. What would you like to know about Yolanda? (enter or "hometown" or "favorite food")ask what else would you like to know about Yolanda
	
	while (choice.equals("y")){
		System.out.println("What would you like to know about another person? Hometown or favorite food)");
		answer = scanner.nextLine();
		
		if (answer.equalsIgnoreCase("hometown")){
			System.out.println(name[studentIndex] + "is from " + hometown [studentIndex]);
			break;
			
		} else if (answer.equalsIgnoreCase("favorite food")){
			System.out.println(name[studentIndex] + " favorite food is" + favFood[studentIndex]);
			break;
			
		} else {
			System.out.println("Pleae choose from hometown or favorite food");
					
		}
		}
		}
	
	}// end of main method
}// end of class
