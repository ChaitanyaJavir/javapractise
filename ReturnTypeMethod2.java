public class ReturnTypeMethod2
{
	public int addition(int a, int b)
	{
		System.out.println("addition method started!!!");
		int res = a + b;
		
		System.out.println("addition method ended!!!");
		
		return res;
	}
	public int square( int a)
	{
		System.out.println("square method started!!!");
		int res = a*a;
		System.out.println("square method ended!!!");
		return res;
	}
	public static boolean EvenNumber(int number)
	{
		if(number % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[]args)
	{
		System.out.println("main method started!!!");
		
		ReturnTypeMethod2 obj = new ReturnTypeMethod2();
		
		int addition_result = obj.addition(10,30);
		System.out.println(">>> Adition is : "+addition_result);
		
		int squareRes = obj.square(addition_result);
		
		System.out.println(">>> Square is : "+squareRes);
		boolean obj2 = EvenNumber(squareRes);
		System.out.println(obj2);
		System.out.println("main method ended!!!");
	}

}
