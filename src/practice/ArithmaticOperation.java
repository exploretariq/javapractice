package practice;

public class ArithmaticOperation {
	
	private int num1;
	private int num2;
	
	
	
	public ArithmaticOperation(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	/**perform addition of  two numbers*/
	public int add()
	{
		return num1+num2;
	}
	
	/**perform subtraction of  two numbers*/
	public int minus()
	{
		
		return Math.abs(num1-num2);
	}
	/**perform multiplication of  two numbers*/
	public int multiply()
	{
		return num1+num2;
	}
	/**perform division of  two numbers*/
	public double divide()
	{
		return num1+num2;
	}
}
