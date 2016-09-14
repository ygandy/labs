import java.text.NumberFormat;
import java.util.ArrayList;


public class Batter {

	public Batter (String batterName){ // generate constructor from superclass
			this.setBatterName(batterName);
	}
	
	private String batterName;
		
	ArrayList<Integer> noAtBats = new ArrayList<>(); //store number of times that each player is at bat
	
	int noOfBasesEarned; //0,1,2,3,4 // 
	int noOfHits; //total from enhanced for loop
	double sluggingPercentage;
	double battingAverage;

	public String calculateBattingAverage(){ //(totalNoHits (at least one base earned)/total NoAtBats ){ 
	//return 0;
		int totalNoHits = 0;
		int totalNoAtBats = noAtBats.size();//for an array the size returns the length or number of elements in an array which is used like an index to go through the array, similar to i++)
		for (int b : noAtBats){//enhanced for loop  to return the batting average for the number of hits (where at least one base is earned)/total number at bats).
			if (b != 0){
				totalNoHits = noOfHits += b;
			}
		}
		//return (double) totalNoHits/totalNoAtBats;//calculation to return batting average
		return formatNumber(totalNoHits/totalNoAtBats);//reformat batting average to three decimal places
	}
	
	
	/*public double calculateSluggingPercentage(){ 
		//return 0;
		int totalNoBasesEarned = 0;
		int totalNoAtBats = noAtBats.size();//for an array the size returns the length or number of elements in an array which is used like an index to go through the array, similar to i++)
		for (int s : noAtBats){//enhanced for loop  to return the batting average for the number of hits (where at least one base is earned)/total number at bats).
			if (s != 0){
				totalNoBasesEarned = noOfBasesEarned += s;
			}
		}
		return (double) totalNoBasesEarned/totalNoAtBats;//calculation to return batting average
	
		//return sluggingPercentage = totalNoOfBasesEarned/totalNoOfBats;
	}*/

		public String formatNumber(double value) {
		NumberFormat num = NumberFormat.getNumberInstance(); // created instance
		num.setMaximumFractionDigits(3);
		return num.format(value);//method type returns a string, yet value returned is a double??
	}

	public void setBatterName(String batterName) {
		this.batterName = batterName;
	}

	public String getBatterName() {
		return batterName;
	}

	
}
