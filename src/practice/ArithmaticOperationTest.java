package practice;

import java.util.Scanner;

public class ArithmaticOperationTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Number:");
		ArithmaticOperation obj=new ArithmaticOperation(sc.nextInt(), sc.nextInt());
		System.out.println("Addtion of two number:"+obj.add());
		System.out.println("Addtion of two number:"+obj.minus());
		System.out.println("Addtion of two number:"+obj.multiply());
		System.out.println("Addtion of two number:"+obj.divide());
		
		
		
	}

	
	
}
