package generics;

import java.util.ArrayList;
import java.util.List;
/*Demo of ? wildcard */
abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Rectangle");
	}

}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("circle");
	}

}

public class WildCardGen {
	public static void print(List<? extends Object> list) {
		for (Object shapes : list) {
			((Shape) shapes).draw();//calling method of Shape class by child class instance  
		}
	}

	public static void main(String[] args) {

		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		list2.add(new Circle());
		print(list1);
		print(list2);

	}

}
