class MethodDemo3
{
	public static void substraction(int a, int b)
	{
		int res = a - b;
		System.out.println("substraction is :"+res);
	}
	public static void main(String[]args)
	{
		System.out.println("main started!!");
		
		MethodDemo3 obj = new MethodDemo3();
		Addition obj2 = new Addition();
		obj2.sum(10,30);
		obj.substraction(30,10);
		
		System.out.println("main ended!!");
	}
	
}
