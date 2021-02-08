package backend;
import java.util.*;

public class Week3Assignment 
{

	public static void main(String[] args) 
	{
		Integer ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
		int agesLength = ages.length - 1;
//1a subtract first value of array from last value
		int rangeOfAges = ages[agesLength]- ages[0];
		System.out.println("1a. Difference between first and last ages: " + rangeOfAges);	
//1b add new age to array
		int newElement = 10;
		//convert array to array list since you can't extend arrays
		List<Integer>newAges = new ArrayList<Integer>(Arrays.asList(ages));
		//add new element
		newAges.add(newElement);
		//change array list back to array
		ages = newAges.toArray(ages);
		System.out.println("1b. Array after adding new element: " + Arrays.toString(ages));	
//1c calculate the average age	
		int sum = 0;
		for(int n : ages)
		{
			sum += n;
		}	
		int average = sum / ages.length;
		System.out.println("1c. Average age of the ages from the array: " + average);	
//2a create array of string for names and calculate the average characters per name
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};	
		int length = 0;
		int charAverage = 0; 	
		for(String string : names)
		{
			length += string.length();
		}	
		charAverage = length / names.length;
		System.out.println("2a. Array of names: " + Arrays.toString(names));
		System.out.println("Average characters per name: " + charAverage);	
//2b concatenate names seperated by spaces
		String concatenated = String.join(", " , names);
		System.out.println("2b. Names concatenated: " + concatenated);
//3 and 4 both word problems in the word doc			
//5 nameLengths array	
	int sumOfLetters = 0;
	for(String name : names)
	{
		sumOfLetters += name.length();
		
	}
	System.out.println("5. Sum of letters of names in the array: " + sumOfLetters);
//6 iterate over nameLengths to find the sum
	System.out.println("6. Sum of elements in array: " + sumOfLetters);
//7 write loop to concatenate string to itself n amount of times
	String testName = "Emilio";
	int n = 5;
	System.out.println("7. Name: " + testName);
	System.out.println("n: " + n);
	System.out.println("Name concatenated into itself n times: " + multipleString(testName, n));
//8 method that takes 2 named and concatenates to a full name separate by space
	String firstName = "Emilio ";
	String lastName = "Gonzalez";
	System.out.println("8. Firstname: " + firstName);
	System.out.println("Lastname: " + lastName);
	System.out.println("FullName: " + fullName(firstName, lastName));
//9 method that takes array of int and returns true if the sum of ints is greater than 100
	int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int numbers2[] = {1, 100};
	System.out.println("9. Array of numbers: " + Arrays.toString(numbers));
	System.out.println("Sum greater than 100: " + isGreaterThan100(numbers));
	System.out.println("Array of numbers2: " + Arrays.toString(numbers2));
	System.out.println("Sum greater than 100: " + isGreaterThan100(numbers2));
//10
	double doubleArray[] = {21.1, 45.5, 90.8};
	System.out.println("10. Array of doubles: " + Arrays.toString(doubleArray));
	System.out.println("Average of elements" + average(doubleArray));
//11
	double doubleArray1[] = {1.1, 2.2, 3.3, 894.4};
	double doubleArray2[] = {5.5, 6.6, 7.7, 8.8, 9.9};
	
	System.out.println("11. First array of doubles: " + Arrays.toString(doubleArray1));
	System.out.println("Second array of doubles: " + Arrays.toString(doubleArray2));
	System.out.println("First array greater than second array: " + IsGreaterThanAverage2(doubleArray1, doubleArray2));
	
}
	//12
	public static boolean IsGreaterThanAverage2(double array[], double array2[])
	{
		boolean check = false;
		double average = 0;
		double average2 = 0;		
        double sum = 0;
		double sum2 = 0;
		for(double n: array)
		{
			sum += n;
		}
		average = sum / array.length;
		for(double n: array2)
		{
			sum2 += n;
		}
		average2 = sum2 / array2.length;	
		if(average > average2)
		{
			check = true;
		}
		else
		{
			check = false;
		}	
		return check;
	} 
	public void willBuyDrink(boolean isHotOutside, double moneyInPocket)
	{
		if(isHotOutside == true && moneyInPocket > 10.50)
		{
			return;
		}
	}
	public static String fullName(String firstName, String lastName)
	{
	String fullName = firstName.concat(lastName);

	return fullName;
	}
	public static String multipleString (String string, int times)
	{
	 String name = string;
	 String name2 = name;
		for(int j = times - 1; j > 0; j--)
		{
			name = name.concat(name2);
		}		
	 return name;
	}	
	public static boolean isGreaterThan100(int array[])
	{
		int sum = 0;
		boolean greaterThan = false;		
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}		
		if(sum > 100)
		{
			greaterThan = true;
		}		
		return greaterThan;
	}	
	public static double average(double array[])
	{
		double sum = 0;		
		for(double n: array)
		{
			sum += n;
		}		
		return sum / array.length;
	}	
	//13 own method
	public static boolean isHot(int temperature)
	{
		boolean check = false;
		if (temperature >= 110)
		{			
			check = true;
		}		
		return check;
	}
	//function checks if the temperature is over 100 and if it is then it returns true; made this 
	//because it is already starting to get hot in Arizona...
}
