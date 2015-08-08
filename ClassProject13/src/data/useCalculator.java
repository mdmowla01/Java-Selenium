package data;

import junit.framework.Assert;

public class useCalculator {

	public static void main(String[] args) {
		calculator cal= new calculator();
		
		int adding=cal.addition(2, 4);
		int subtracting=cal.subtraction(9, 7);
		System.out.println(adding);
		
		
		System.out.println(subtracting);
		
		Assert.assertEquals(6,adding);
		Assert.assertEquals(2,subtracting);

	}

}
