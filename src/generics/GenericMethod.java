package generics;

public class GenericMethod {
	public static <E> void print(E[] arr)
	{
		for (E e : arr) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Integer arr1[]= {654,654,9,5,8,5,68};
		String arr2[]= {"s","ada","sdgfg","sgfggty"};
		//new GenericMethod().print(arr1);
		//new GenericMethod().print(arr2);
		print(arr1);
		print(arr2);
	}
	

}
