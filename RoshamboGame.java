import java.util.Scanner;

public class RoshamboGame {

	public static void main(String[] args) {
		 Player rockPlayer = new RockPlayer("Rocky");
		  //System.out.println(rockPlayer.generateRoshambo());
		 Player randomPlayer = new RandomPlayer("Rhonda");
		 //System.out.println(randomPlayer.generateRoshambo());
		 Player humanPlayer = new HumanPlayer("Yolanda");
		 //System.out.println(humanPlayer.generateRoshambo());
		 
		 //Create variables to hold results:
		 Player opponent;//may need to set to null; Player opponent == null
		 Roshambo humanResult;
		 Roshambo opponentResult;
		 Roshambo opponentAlwaysRock; 
		 String playAnotherGame = "y";
		 
		 //Calculate counts 
		 
		 
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Welcome. Thank you for choosing to play Roshambo!"); 
		 
		 System.out.println("Please enter your name?");
			String name = scanner.next();
			humanPlayer.setPlayerName(scanner.next()); //how do we use playerName from Player

		 System.out.println("Hello" + name + "Do you want to play against random or rock?");
			String choice = scanner.next();

		while (playAnotherGame.equalsIgnoreCase ("y")){
			
			String yesOno = "y";
			while (yesOno.equals("y")) {	

				switch (choice) {
	
				case "rock":
					opponent = new RockPlayer("Rocky");// need at least one parameter
					break;
	
				case "random":
					opponent = new RandomPlayer("Rhonda");
					break;
	
				default:
					throw new IllegalArgumentException("Must type 'random' or 'rock");
				}
			}
				
			//System.out.println(opponent.generateRoshambo());//generates opponent choice
			//System.out.println(humanPlayer.getName() + humanResult);
			//system.out.println(userPlayer.getPlayerName()
			//System.out.println(opponentName + " ??)
		
			
			opponentResult = randomPlayer.generateRoshambo);
			opponentAlwaysRock = rockPlayer.generateRoshambo();
			humanResult = humanPlayer.generateRoshambo();
			
			
		switch  (humanResult) {
		
		case ROCK:
		}
			if opponentResult == Roshambo.PAPER) { 
					System.out.println(HumanPlayer "wins"));
			}
			
			if opponentResult = "scissors" and humanResult = "rock", then HumanPlayer wins
					System.out.println(HumanPlayer "wins"));
			}
		
			if opponentResult = "rock" and humanResult = "rock", then tie
					System.out.println(HumanPlayer "wins"));
			}*/
	
			System.out.println("Would you like to play another game? (y/n)");
			playAnotherGame =scanner.next();

}//ends outer while loop
		System.out.println(("Goodbye."));
}//ends public class Main
}//ends public class Roshambo

