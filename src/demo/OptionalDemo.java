package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String str[] = new String[15];
		String str1="null";
		Optional<String> check = Optional.ofNullable(str[10]);
		String s;
		if (check.isPresent()) {
			s = str[10].toLowerCase();
			System.out.println(s);
		} else {
			System.out.println("Enter string value");

		}

		/*
		 * List<Integer> list =new ArrayList<Integer>(); System.out.println(list);
		 */
	}

}
