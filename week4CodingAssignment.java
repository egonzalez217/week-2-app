package backend;
import java.util.*;

public class week4CodingAssignment 
{

	public static void main(String[] args) 
	{
		
//1 create an instance of ArrayList of String called employeeNames
		ArrayList<String> employeeNames = new ArrayList<String>();
		
//2 create an instance of HashSet of Integer called ids
		HashSet<Integer> ids = new HashSet<Integer>();
		
//3 create an instance of HashMap of integer
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		
//4 add at least 5 entries to the employeeNames and Ids (make sure both collections have the same number of entries
		employeeNames.add("Mya");
		employeeNames.add("Cole");
		employeeNames.add("Ahmad");
		employeeNames.add("Emilio");
		employeeNames.add("Hanul");

		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
//5 create variable Int i = 0 then iterate over Ids using an enhanced for loop. inside the enhanced for loop use employeeMap.put();
//to add a new entry to the map. The entry should consist of a key that is the id in the enhanced loop's current iteration
//and a value that is the employeeName at the position i of the employeeNames ArrayList. increment i so that each iteration grabs the 
//next element in the ArrayList
		int i = 0;
		for(Integer id : ids)
		{
			employeeMap.put(id, employeeNames.get(i));
			i++;
			
		}
		System.out.println(employeeMap.toString());
//6 Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(),
//and use the key for each current iteration to print to the console both the current key and its associated value in the map.
		for(Integer id : employeeMap.keySet())
		{
			 System.out.println(id + " = " + employeeMap.get(id));
		}
//7 Create a StringBuilder called idsBuilder
		StringBuilder idsBuilder = new StringBuilder();
//8 Iterate over the Ids HashSet and append each id, followed by a dash "-" to idsBuilder 
		for(Integer id : ids)
		{
			idsBuilder.append(id).append("-");
		}
//9 Print the result of idsbuilder.toString() to the console
		System.out.println(idsBuilder);
//10 Create another StringBuilder called namesBuilder
		StringBuilder namesBuilder = new StringBuilder();
//11 Iterate over the employeeNames ArrayList and append each name, followed by a space " " to the NamesBuilder
		for(String string : employeeNames)
		{
			namesBuilder.append(string).append(" ");
		}
//12 Print the result of namesbuilder.toString() to the console
		System.out.println(namesBuilder);
	}

}
