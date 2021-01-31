package backend;

public class week2lab 
{

	public static void main(String[] args) 
	{
		//drivers license example
		int age = 14;
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >= 16);
		
		
		boolean hasLicense = true;
		if((age >= 16) && (hasLicense = true))
		{
			System.out.println("You can drive");
		}
		else 
		{
			System.out.println("You cannot drive");
		}
		
		//milk example
		double costOfMilk = 3.15;
		int thirstLevel = 5;
		
		if(costOfMilk < 2.5 || thirstLevel > 6) 
		{
			System.out.println("Milk please");
		}
		else 
		{
			System.out.println("No Thanks");
			
		}
		
		//cookies example
		int numberOfCookies = 20;
		int numberOfChildren = 12;
		
		int remainingCookies = numberOfCookies % numberOfChildren;
		
		if(remainingCookies >= 5)
		{
			System.out.println("Jackpot!");
		}
		else if(remainingCookies >= 2)
		{
			System.out.println("Woohoo!");
		}
		else if(remainingCookies > 0)
		{
			System.out.println("Yes!");
		}
		else
		{
			System.out.println("Sad Face");
		}
		
		//loyalty member example
		
		String loyaltyMemberStatus = "silver";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus)
		{
		case "silver":
			loyaltyMemberDiscount = .1;
			break;
		case "gold":
			loyaltyMemberDiscount = .15;
			break;
		case "platinum":
			loyaltyMemberDiscount = .25;
			break;
		}
		
		System.out.println(loyaltyMemberDiscount);
		
		double billTotal = 40;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		
		System.out.println(adjustedTotal);
		
		if(adjustedTotal > 500)
		{
			if(loyaltyMemberStatus == "silver")
			{
				loyaltyMemberStatus = "gold";
			}
			else if(loyaltyMemberStatus == "gold")
			{
				loyaltyMemberStatus = "platinum";
			}
			
		}
		
		System.out.println(loyaltyMemberStatus);
		
		//username example
		String username = "emilio123";
		String password = "pass123";
		
		if(username == "emilio123" && password == "pass123")
		{
			System.out.println("login succesful");
		}
		else 
		{
			System.out.println("access denied");
		}
		
		//for loop examples
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		for(int i = 10; i <= 0; i--)
		{
			System.out.println(i);
		}
		
		for(int i = 0; i <= 100; i += 2 )
		{
			System.out.println(i);
		}
		
		for(int i = 0; i <= 100; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("odd");
			}
			
		}
		
		int i = 100;
		while (i > 0)
		{
			System.out.println(i + " " + (i % 3));
			i--;
		}
		
	}

}
