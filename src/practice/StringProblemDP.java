package practice;
import java.util.Optional;

/** Finding maximum length of substring between given two strings */
public class StringProblemDP {
	/** Function for max substring between two strings */
	public String findMaxSubstring(final String str1, final String str2) {
		int maxindex=0,max=0;
		int lookup[][]=new int[str1.length()][str2.length()];
		/** Optional for handling null pointer exception */
		Optional<String> nullCheck1 = Optional.ofNullable(str1);
		Optional<String> nullCheck2 = Optional.ofNullable(str2);

		/** All if conditions for check all failure and precheck cases */
		if (nullCheck1.isPresent() && nullCheck2.isPresent()) {
			if (str1.equalsIgnoreCase(str2)) {
				return str1;
			}

			if (str1.contains(str2)) {
				return str2;
			}

			if (str2.contains(str1)) {
				return str1;
			}
			/** logic for constructing m*n lookup table and keeping the index of max number of matrix */			
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str2.length(); j++) {
					if(str1.charAt(i)==str2.charAt(j))
					{					
						if(!(i==0||j==0))
						{
							lookup[i][j]=lookup[i-1][j-1]+1;
							if(max<lookup[i][j]) {
								max=lookup[i][j];
								maxindex=j;
							}
								
						}
						else
						{
							lookup[i][j]=1;
							if(max<lookup[i][j]) {
								max=lookup[i][j];
								maxindex=j;
							}						
						}
					}
					
				}
			}
			

		} else {
			return "Please Enter 2 strings!";

		}

		return str2.substring(maxindex+1-max, maxindex+1);

	}

}