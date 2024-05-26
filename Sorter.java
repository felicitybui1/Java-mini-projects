public class Sorter
{
	
	public static void main (String[]args)
	{
		if(args.length <3)
		{
			System.out.println("Please enter at least 3 or more words");
			System.exit(-1);
		}
		String stringlist= "";
		for (int i = 0; i < args.length; i++)
		{	
			stringlist += args[i];
			stringlist += " ";
			System.out.println("The string is: "+ (args[i]));
		}
		System.out.println(" ");
		System.out.println("After concatenating, the string is: "+ stringlist);
		String[] stringarray = stringlist.split(" ");                           // Split the string by space
		String []sortedarray = getSorted(stringarray);
		StringBuilder words = new StringBuilder("");
		System.out.println("");
		System.out.println("The strings are printed in alphabetical order, on separate lines as follow:");
		for (String s :sortedarray)
		{
			StringBuilder builder = new StringBuilder(s);
			System.out.println(builder);
			words.append(builder);
			words.append(" ");
		}
		System.out.println("");
		System.out.println("The strings are printed in alphabetical order, concatenated into a single line as follow: ");
		System.out.println(words.toString());

	}

	static String[] getSorted (String[]stringarray)
	{	
		for (int word = 0; word < stringarray.length; word++) // Create an outer loop that iterates through all elements of the array until it reaches the length of array, using "word" as the index
		{
			for (int word2 = word + 1; word2 < stringarray.length; word2++) // Create a nested loop, within the first loop, that goes through all elemenets of the array starting from the element after the current "word" index element
			{
				if(stringarray[word].compareTo(stringarray[word2]) > 0) // Compare adjacent strings and swap if necessary for ascending order
				{
					String i = stringarray[word]; 			// Assign a greater word to a temporary variable
					stringarray[word] = stringarray[word2];         // Swap the small word to the position of the greater word
					stringarray[word2] = i;                         // Swap the original greater word stored in the temporary variable with the position of the smaller word 
				}
			}
		} 
		//for (String s: stringarray)                                            
		//{             
		//	System.out.println(s); //Run a for loop to print all element of the sorted array
		//}
		return stringarray;

		
	}

} 