
public class Player {
	
	private String playerName; 
	
	public Player(String playerName){ //this is the only constructor because it has the same name as the class Player and no return type
		this.playerName = playerName;
	}
	
	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}
	
	public String getPlayerName(){
		return playerName;
	}

	public Roshambo generateRoshambo(){//this is the signature that will be overidden by all the players
		
	return null;//have to create a new constructor called generateRoshambo?
	}

	/*@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}*/
	
}
