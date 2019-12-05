package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Finding maximum length of substring between given two strings */
public class StringProblem {
	/** Function for max substring between two strings */
	public String findMaxSubstring(final String str1, final String str2) {
		int maxLength = 0;
		int maxIndexString = 0;
		final List<String> stringCombinations = new ArrayList<String>();

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

			/** storing combination of string into list */
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str1.length() - i + 1; j++) {
					stringCombinations.add(str1.substring(i, i + j));
				}
			}

			/** logic for find maximum matching sequence iterating stringcombination list */
			for (int i = 0; i < stringCombinations.size(); i++) {

				if (str2.contains(stringCombinations.get(i)) && stringCombinations.get(i).length() > maxLength) {
					maxIndexString = i;
					maxLength = stringCombinations.get(i).length();
				}
			}

		} else {
			return "Please Enter 2 strings!";

		}

		return stringCombinations.get(maxIndexString);

	}

}