package demo;

import java.util.HashMap;

public class Apple {
	private final String color;
	
 
	public Apple(String color) {
		this.color = color;
	}
 
	
	public static int changevalue(final int num)
	{
		return num*10;
	}
	
	 

	
	  @Override public boolean equals(Object obj) { if (this == obj) return true;
	  if (obj == null) return false; if (getClass() != obj.getClass()) return
	  false; Apple other = (Apple) obj; if (color == null) { if (other.color !=
	  null) return false; } else if (!color.equals(other.color)) return false;
	  return true; }
	  
	 
	public static void main(String[] args) {
		Apple a1 = new Apple("green");
		Apple a2 = new Apple("red");
		System.out.println(a1.equals(a2));
		//hashMap stores apple type and its quantity
		HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);
		System.out.println(m);
		System.out.println(m.get(new Apple("green")));
		System.out.println(changevalue(10));
	}
}
