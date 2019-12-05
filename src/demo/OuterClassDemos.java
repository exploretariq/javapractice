package demo;

public class OuterClassDemos {

	private String name="Madan";
	static String address="sdlkjfhdsjfkjs";
			
	
	static class  InnerStaticClass{
		private String innerName="innerstatic";
		
		void print()
		{
			System.out.println("Name:"+address);
		}
		
	}
	
	
	
	
	class InnerClass{
		
	String inner="Non static";
	
		void print()
		{   System.out.println("Non-static inner class method..");
			System.out.println("Name:"+name);
		}
		
	}
	
	//outer class print  method
	
	
	void print()
	{
		 System.out.println("Non-static Outer class method..");
		System.out.println("Name:"+name);
		//Not accessible to outer class
		//System.out.println("innerName"+innerName);
	}
	
	public static void main(String[] args) {
		OuterClassDemos.InnerStaticClass innerstatic = new OuterClassDemos.InnerStaticClass();
		OuterClassDemos outer =new OuterClassDemos();
		OuterClassDemos.InnerClass inner= new OuterClassDemos().new InnerClass();
		inner.print();
		outer.print();
		innerstatic.print();
		
	}

}
