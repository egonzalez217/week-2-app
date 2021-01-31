package backend;

public class week2 
{

	public static void main(String[] args) 
	{
	//step 2
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		
	//step 3
		double costOfMilk = 4.99;
		double moneyInWallet = 10;
		int thirstLevel = 10;
		
	//step 4
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !(isWeekday);
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= 2 * costOfMilk);
		
		System.out.println("Is Hot: " + isHotOutside);
		System.out.println("Is Weekday: " + isWeekday);
		System.out.println("Has Money: " + hasMoneyInPocket);
		
		System.out.println("Cost Of Milk: " + costOfMilk);
		System.out.println("Money In Wallet: " + moneyInWallet);
		System.out.println("Thirst Level: " + thirstLevel);
		
		
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
	}

}
