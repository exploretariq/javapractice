package hackerrank;

public class HourGlassProblem {

	public static void main(String[] args) {
		int arr[][] = {{1,1,1,0},{0,1,0,0},{1,1,1,0},{1,1,1,0}};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println("sum:"+sum);
	}
}
