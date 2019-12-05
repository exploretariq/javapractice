package datastructure;

import java.util.HashMap;


class HashCodeDemo{

	int id;
	String name;
	public HashCodeDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class MapImpl {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("A", 11);
		map.put("A",12);
		//map.containsKey(key)
		System.out.println(map.get('A'));
		HashCodeDemo code=new HashCodeDemo(113, "mno");
		HashCodeDemo code1=new HashCodeDemo(113, "mno");
		System.out.println(code.equals(code1));
		HashMap<HashCodeDemo , Integer> ma=new HashMap<HashCodeDemo, Integer>();
		ma.put(code1, 1);
		ma.put(code, 2);
		System.out.println("jafkjh"+ma);
		for (int i = 97; i < 122; i++) {
			
			char t= (char)i;
			map.put(Character.toString(t), i);	
		}
		
		System.out.println(map);
		
		String str="Hello";
		//getting hascode value of str
		System.out.println(str.hashCode());

				int x=10;
				System.out.println("x^2:"+(x^6));
		
		
		System.out.println();
		
		
		
	//	HashCodeDemo code1=new HashCodeDemo(111, "abc");
		
		System.out.println(code1.hashCode());
		
		
		/*
		 * HashCodeDemo code3=new HashCodeDemo(113, "mno"); HashCodeDemo code4=new
		 * HashCodeDemo(114, "xyz"); System.out.println(code1);
		 * //System.out.println(code2); System.out.println(code3);
		 * System.out.println(code4);
		 * System.out.println(Integer.toHexString(code1.hashCode()));
		 */
		

	
	int n=5;
	for (int i = 1; i <5 ; i++) {
		System.out.println((i-1)+"	"+i+"	"+(n-1));
	}
	
	System.out.println(n);
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
