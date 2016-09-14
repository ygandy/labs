//import java.util.Random;

public class RandomPlayer extends Player {
	
	public RandomPlayer(String playerName){
		super(playerName);
	}
	
	Roshambo result;
	
	@Override
	public Roshambo generateRoshambo() {
		int random = (int) (Math.random() * 3) + 1;

		switch (random) {//will allow random player to return rock, paper or scissors

		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		case 3:
			return Roshambo.SCISSORS;

		default:
			return result;

		}

	}

}
