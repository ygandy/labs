import java.util.ArrayList;

public class BatterApp {

	
	public static void main(String[] args) {
		Batter batter = new Batter("Charles");
		batter.noAtBats.add(0);
		batter.noAtBats.add(1);// 1/2 = .500
	
	System.out.println(batter.calculateBattingAverage());
//
//		ArrayList<NoOfAtBats> list = new ArrayList<Integer>();
//		list.add(new Movie("Frozen", "animation"));
//		list.add(new Movie("Wall-e", "animation"));
//		list.add(new Movie("Ice Age", "animation"));
//		list.add(new Movie("Concussion", "drama"));
//		list.add(new Movie("Pursuit of Happiness", "drama"));
//		list.add(new Movie("The Ring", "horror"));
//		list.add(new Movie("Conjuring", "horror"));
//		list.add(new Movie("Texas Chainsaw", "horror"));
//		list.add(new Movie("Bridesmaid", "comedy"));
//		list.add(new Movie("Coming to America", "comedy"));

	}

	/* private static char[] calculateBattingAverage() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
