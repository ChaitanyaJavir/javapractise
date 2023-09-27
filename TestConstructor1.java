public class TestConstructor1
{
	public static void main(String[]args)
	{
		Student1 s1 = new Student1();
		s1.age = 10;
		s1.height = 4;
		s1.weight = 30;
		s1.roll = 7;
		s1.name = "Ram";
		
		System.out.println(s1.age);
		System.out.println(s1.height);
		System.out.println(s1.weight);
		System.out.println(s1.roll);
		System.out.println(s1.name);
		
		Student1 s2 = new Student1(10, "ABC");
		System.out.println(s2.age);
		System.out.println(s2.height);
		System.out.println(s2.weight);
		System.out.println(s2.roll);
		System.out.println(s2.name);
		
		Student1 s3 = new Student1(20, "AAA", 5, 35, 15);
		System.out.println(s3.age);
		System.out.println(s3.name);
		System.out.println(s3.height);
		System.out.println(s3.weight);
		System.out.println(s3.roll);
		
		Student1
		s4 = new Student1(25, "IT", "sita");
		System.out.println(s4.roll);
		System.out.println(s4.dept);
		System.out.println(s4.name);
	}
	
		

	}
	
	  
		

