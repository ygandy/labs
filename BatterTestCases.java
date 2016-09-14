import org.junit.Assert;
import org.junit.Test;


public class BatterTestCases {

//	@SuppressWarnings("deprecation")
	/*@Test 
	public void battingAvg0_1(){
		Batter batter = new Batter("Charles");
		batter.noAtBats.add(0);//first time batter at bat, he struck out. this is a new instance of batter (class)/noAtBats (array list)/using add (method) to add array info at end of array list
		batter.noAtBats.add(1);//second attempt at bat, he hit the bat (earning one base) resulting in a batting average of 1 hit/2 attempts or .500)
		Assert.assertEquals("0.500", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void battingAvg0_0(){
		Batter batter = new Batter("Gladies");
		batter.noAtBats.add(0);
		batter.noAtBats.add(0);
		Assert.assertEquals("0.000", batter.calculateBattingAverage());
	//	Assert.assertEquals("0.000", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void battingAvg4_4_4(){
		Batter batter = new Batter("Shirley");
		batter.noAtBats.add(1);
		batter.noAtBats.add(1);
		batter.noAtBats.add(1);//three hits (home runs)/three attempts = 3/3 = 1.000
		Assert.assertEquals("1.0", batter.formatNumber(batter.calculateBattingAverage()));
	//	Assert.assertEquals("1.000", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void battingAvg0_1_2(){
		Batter batter = new Batter("Alesha");
		batter.noAtBats.add(0);
		batter.noAtBats.add(1);
		batter.noAtBats.add(1); //two hits/three attempts = 2/3 = .667
		Assert.assertEquals("0.667", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void battingAvg0_0_3_0(){
		Batter batter = new Batter("Yolanda");
		batter.noAtBats.add(0);
		batter.noAtBats.add(0);
		batter.noAtBats.add(1);
		batter.noAtBats.add(0);//one hit/four attempts = 1/4 = .250
		Assert.assertEquals("0.250", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void battingAvg2_2_1_4(){
		Batter batter = new Batter("Bria");
		batter.noAtBats.add(1);
		batter.noAtBats.add(1);
		batter.noAtBats.add(1);
		batter.noAtBats.add(1);//four hits/four attempts = 4/4 = 1.000
		Assert.assertEquals("1.000", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void battingAvg0_1_4_0(){
		Batter batter = new Batter("Maia");
		batter.noAtBats.add(0);
		batter.noAtBats.add(1);
		batter.noAtBats.add(1);
		batter.noAtBats.add(0);//two hits/four attempts = 2/4 = .500
		Assert.assertEquals("0.500", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void battingAvg0(){
		Batter batter = new Batter("Michael");
		batter.noAtBats.add(0);//no hits/one attempt = 0/1 = 0
		Assert.assertEquals("0.000", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void battingAvg3(){
		Batter batter = new Batter("Darrin");
		batter.noAtBats.add(1);//one hit/three attempts = 1/3 = .333
		Assert.assertEquals("0.333", batter.formatNumber(batter.calculateBattingAverage()));
	}*/
	
	//TEST CASES FOR SLUGGAGE PERCENTAGES
	@Test 
	public void sluggingPer0_1(){
		Batter batter = new Batter("Charles");
		batter.noAtBats.add(0);
		batter.noAtBats.add(1);// 1/2 = .500
		Assert.assertEquals("0.500", batter.calculateSluggingPercentage());
		//Assert.assertEquals("0.500", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void sluggingPer0_0(){
		Batter batter = new Batter("Gladies");
		batter.noAtBats.add(0);
		batter.noAtBats.add(0);
		Assert.assertEquals("0", batter.calculateBattingAverage());
	//	Assert.assertEquals("0.000", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void sluggingPer4_4_4(){
		Batter batter = new Batter("Shirley");
		batter.noAtBats.add(4);
		batter.noAtBats.add(4);
		batter.noAtBats.add(4);// 12/3 = 4.000
		Assert.assertEquals("4.000", batter.calculateBattingAverage());
	*****//	Assert.assertEquals("4.000", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void sluggingPer0_1_2(){
		Batter batter = new Batter("Alesha");
		batter.noAtBats.add(0);
		batter.noAtBats.add(1);
		batter.noAtBats.add(2); // 3/2 = 1.5
		Assert.assertEquals("1.5", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void sluggingPer0_0_3_0(){
		Batter batter = new Batter("Yolanda");
		batter.noAtBats.add(0);
		batter.noAtBats.add(0);
		batter.noAtBats.add(3);
		batter.noAtBats.add(0);// 3/4 = .750
		Assert.assertEquals("0.75", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void sluggingPer2_2_1_4(){
		Batter batter = new Batter("Bria");
		batter.noAtBats.add(2);
		batter.noAtBats.add(2);
		batter.noAtBats.add(1);
		batter.noAtBats.add(4);// 9/4 = 2.25
		Assert.assertEquals("2.25", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void sluggingPer0_1_4_0(){
		Batter batter = new Batter("Maia");
		batter.noAtBats.add(0);
		batter.noAtBats.add(1);
		batter.noAtBats.add(4);
		batter.noAtBats.add(0);// 5/4 = 1.25
		Assert.assertEquals("1.25", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void sluggingPer0(){
		Batter batter = new Batter("Michael");
		batter.noAtBats.add(0);// 0/1 = 0
		Assert.assertEquals("0", batter.formatNumber(batter.calculateBattingAverage()));
	//	Assert.assertEquals("0.000", batter.formatNumber(batter.calculateBattingAverage()));
	}
	
	@Test
	public void sluggingPer3(){
		Batter batter = new Batter("Darrin");
		batter.noAtBats.add(3);// 3/1 = 3
		Assert.assertEquals("3", batter.formatNumber(batter.calculateBattingAverage()));
	
	}
	//end of Slugging Test cases
	

}//end of public class batter

