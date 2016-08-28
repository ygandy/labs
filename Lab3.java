import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ask user to enter an integer number (noSqrCub) which they wish to be squared and cubed
		// First set or initialize string yesOrno = "y"
		
	Scanner scanner = new Scanner(System.in);
		String yesOrno = "y";
		
		while (yesOrno.equalsIgnoreCase("y")) {
			
			System.out.println("Please enter an integer:");
			int noSqrCub = scanner.nextInt();
			System.out.println();
	
			System.out.println("Number   Squared    Cubed");
			System.out.println("======   =======    =====");

				for (int i = 1; i <= noSqrCub; i++) {
				int sqr2 = i * i;
				int cub3 = i * i * i;

				System.out.println(i + "    \t" + sqr2 + "\t     " + cub3);
			}
			
			// Ask User if they want to continue? Enter "y" or "n"
			
			System.out.println("Would you like to continue: 'y' or 'n'?");
			yesOrno = scanner.next();
			
			}
		System.out.println("Goodbye!");
		scanner.close();
	}
}