package hackerrank;

public class RotateLeft {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n=5;
		for (int i = 0; i < 4; i++) {
            int temp=a[0];
           
            for (int j = 1; j < n; j++)
             {
                 a[j-1]=a[j];
                
             }
             a[n-1]=temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        
        
       
        

	}

}
