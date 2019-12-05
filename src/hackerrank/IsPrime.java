package hackerrank;

public class IsPrime {

	public static void main(String[] args) {
		int n=7;
		for (int i = 2; i <n/2 ; i++) {
			if(n%i==0)
			{
				System.out.println("Not prime");
				break;
			}
			else
			{
				System.out.println("Prime");
			}
		}
	}

}
