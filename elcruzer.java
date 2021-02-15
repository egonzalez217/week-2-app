package backend;
import java.util.*;

public class elcruzer 
{

	public static void main(String[] args) 
	{
	
		int i = 100;
		
		while (i >= 0)
		{
			System.out.println(i);
			
			if(i == 1)
			{
				i = i - 1;
				System.out.println(i);
			}
			
			i = i-3;
			
		}
		
		String firstname = "emilio";
		String lastname = "gonzalez";
		
		String fullname = firstname + " " + lastname;
		
		System.out.println(fullname);
		
		int amount = 5;
		String name = "bruh";
		String name2 = name;
		
		for(int j = amount - 1; j > 0; j--)
		{
			name = name.concat(name2);
			//System.out.println(name);
		}
		
		System.out.println(name);
		
		int one = 2;
		int two = 4;
		
		int value = one;
		
		for(int j = two - 1; j > 0; j--)
		{
			value = value * one;
		}
		System.out.println(value);
		
		
		Map<String, String> map1 = new HashMap<>();
		List<Integer> testlist = new ArrayList<Integer>();
		//testlist.createListWithEveryOtherElement();
		
	}

	public List<String> getValuesFromMapWhereKeyStartsWithA(Map<String, String> map) {
		//Map<String, String> map1 = new HashMap<>();
		List<String> list = new ArrayList<String>();

		map.forEach((k, v ) ->
		{
			list.add(v);
		});
		
		return list;

	}
	
	public List createListWithEveryOtherElement(List list) 
	{
		List copy = new ArrayList<>();
		int size = list.size();
		copy.addAll(list);
		for(int i = 1; i <= size; i++)
		{
			i = i + 1;
			
			copy.remove(i);
		}
		
		return copy;
		/*int size = list.size();
		for(int i = 0; i <= size; i++)
		{
			i = i + 1;
			list2.add(i);
		}
		*/
	}
	
}
