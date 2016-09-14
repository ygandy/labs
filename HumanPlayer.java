import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String playerName) {// generate constructor from super
												// class. Is this the signature 
		super(playerName);
	}

	@Override
	public Roshambo generateRoshambo() {

		// return enum value after calling generateRoshambo();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you want to play as rock, paper of scissors?");
		String choice = scanner.nextLine();
//char userMove = sc.nextLine().toUpperCase().charAt(0); 

		// HumanPlayer enters choice: rock, paper or scissors;

		switch (choice) {
		
		case "rock"://case 'R', "P". "S"
			return Roshambo.ROCK;

		case "paper":
			return Roshambo.PAPER;

		case "scissors":
			return Roshambo.SCISSORS;

		default:
				throw new IllegalArgumentException("Must be 'rock', 'place', or 'scissors'");
		}
		//System.out "invalid choice";
		//return generateRoshambo(); "reoccurrence method"
	}

	// this is me and take my input and generateRoshambo.
	//
}
