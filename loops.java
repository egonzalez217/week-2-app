package backend;

public class loops 
{

	public static void main(String[] args) 
	{
		//step a
		int i = 0;
		while(i <= 100)
		{
			System.out.println(i);
			i = i + 2;
		}

		//step b
		i = 100;
		while (i >= 0)
		{
			int x = i % 3;
			if(x == 0)
			{
				System.out.println(i);
				i--;
			}
			else 
			{
				i--;
			}
		}
		
		//step c
		for(int j = 1; j <= 100; j = j + 2)
		{
			System.out.println(j);
		}
			
		///step d
		int a, b;
		for(int k = 0; k <= 100; k++)
		{
			a = k % 3;
			b = k % 5;
			
			if(a == 0 && b == 0)
			{
				System.out.println("HelloWorld");
			}
			else if(a == 0)
			{
				System.out.println("Hello");
			}
			else if(b == 0)
			{
				System.out.println("World");
			}
			else
			{
				System.out.println(k);
			}
			
		}
	}

}
