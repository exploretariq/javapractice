package practice;

public class MaxSubsequence {
	static public void findMaxSequnce()
	{	String str1="pqr";
		String str2="jshfdkjhpqr";
		//System.out.println(str1.substring(4, 7));
		int minindex=0,maxindex=0,max=0;
		int lookup[][]=new int[str1.length()][str2.length()];
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i)==str2.charAt(j))
				{					
					if(!(i==0||j==0))
					{
						lookup[i][j]=lookup[i-1][j-1]+1;
						if(max<lookup[i][j]) {
							max=lookup[i][j];
							minindex=i;
							maxindex=j;
						}
							
					}
					else
					{
						lookup[i][j]=1;
						if(max<lookup[i][j]) {
							max=lookup[i][j];
							minindex=i;
							maxindex=j;
						}						
					}
				}
				
			}
		}
		
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				System.out.print(lookup[i][j]+"	");
			}
			System.out.println();
		}
		
		System.out.println("minIndex:"+minindex+"maxindex:"+maxindex);
		System.out.println("Max:"+max);
		System.out.println(str2.substring(maxindex+1-max, maxindex+1));
	}
	
public static void main(String[] args) {
	findMaxSequnce();
}
}
