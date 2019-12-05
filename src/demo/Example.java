package demo;

import java.util.Scanner; 

/** 
* 
* @author 
*/
public class Example { 
    /** 
* This is a program for adding two numbers in java. 
    * @param args 
*/
    public static void main(String[] args) 
    { 
		/*
		 * String str="abc"; for (int i = 0; i < str.length(); i++) { for (int j = 0; j
		 * < str.length()-i+1; j++) { System.out.println(str.substring(i,i+j)); } }
		 */
    	arrDemo();
    } 
    
	/*
	 * void m(int param) { new Thread(new Runnable() { public void run() {
	 * System.err.println(param); } }).start(); }
	 */
    
static public void arrDemo()
{
	int a[][]=new int[2][2];
	System.out.println(++(a[0][0]));
	System.out.println(33>>1);
}


	






} 