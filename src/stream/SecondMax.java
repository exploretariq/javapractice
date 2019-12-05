package stream;

public class SecondMax {

	
	static int findMax(int a[])
	{
		
		int m2=0;
		
		try {
			
			if(a.length>2) {
				
				
				
			int m1=a[0];
				
			for (int i = 1; i < a.length; i++) {
				
				
				if(m1<a[i])
				{
					System.out.println("in for");
					m2=m1;
					m1=a[i];
			
				}
				
				if(m2<a[i]&&a[i]<m1)
				{
					m2=a[i];
				}
							
			} }
			
			else {
				System.out.println("Invalid Input");
			}
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
		}
		
		
	return m2;
	}
	
	public static void main(String[] args) {
		
		int a[]= {-10,1,4,5};
		System.out.println("Second max:"+findMax(a));

	}

}
