
public class RockPlayer extends Player { //has its own default constructor which are not inherited from Parent which is not visible and has no parameters

	public RockPlayer(String playerName) {//generate constructor from super class
		super(playerName);
	}
	
	//add method to get publice string getOpenent playerName
	
	
	@Override
	public Roshambo generateRoshambo() {	//This signature line has to be exactly the same as the child just the body was different	
		return Roshambo.ROCK;
		//will always return ROCK();
	}

	
	
}
