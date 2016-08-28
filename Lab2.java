import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		// Ask User What is your name?"
		System.out.println("What is your name?");
		String name = scanner.nextLine();

		// Ask User if they want to play a game? Enter "y" or "n"
		System.out.println("Would you like to play a game? Please enter 'y' or 'n' ?");
		String choice = scanner.nextLine();

		if (choice.equalsIgnoreCase("y")) {
			// Ask User what level would they like to play
			System.out.println("What level would you like to play? 1, 2, or 3?");
			int level = scanner.nextInt();

			String weapon;

			switch (level) {
			case 1:
				System.out.println(name + ": You have chosen to face the beast with one head");
				weapon = "slingshot";
				System.out.println("Your chosen weapon is a " + weapon
						+ ". If you hit the dragon in the head, you will become David who slayed Goliath!");
				break;

			case 2:
				System.out.println(name + ": You have chosen to face the beast with two heads");
				weapon = "bow and arrow";
				System.out.println("Your chosen weapon is a " + weapon
						+ ". If you shoot the dragon in the heart, you will become Braveheart!");
				break;

			case 3:
				System.out.println(name + ": You have chosen to face the beast with three heads");
				weapon = "sword";
				System.out.println("Your chosen weapon is a " + weapon
						+ ". If you cut off either of the dragon's heads, you will become the ultimate Spartan!");
				break;

			default:
				System.out.println(name + ": You have chosen either to run away or chose a beast with no head or more than 3 heads!");
				weapon = null;
				
			} 
			
		} else {
			
			System.out.println("  You have decided to not play at this time. " + name + " bye!");
			scanner.close();
		}

	}

}
