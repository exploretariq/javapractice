package demo;

public class GFG

{

// Recursive function to  

// count the number of  

// occurrences of "hi" in str. 

	static int countSubstrig(String str1,

			String str2)

	{

		int n1 = str1.length();

		int n2 = str2.length();

		// Base Case

		if (n1 == 0 || n1 < n2)

			return 0;

		// Recursive Case

		// Checking if the first

		// substring matches

		if (str1.substring(0, n2).equals(str2))

			return countSubstrig(str1.substring(n2 - 1), str2) + 1;

		// Otherwise, return the count

		// from the remaining index

		return countSubstrig(str1.substring(n2 - 1),str2);

	}

// Driver Code 

	public static void main(String args[])

	{

		String str1 = "geeksforgeeks",

				str2 = "geeks";

		System.out.println(countSubstrig(str1,

				str2));

		str1 = "hikakashi";

		str2 = "hi";

		System.out.println(countSubstrig(str1,

				str2));

	}

}