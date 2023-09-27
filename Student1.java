public class Student1 extends Person1
{
   int roll;
   String name;
   
   public Student1()
   {
	   super();
	   this.roll = 10;
	   this.name = "Sham";
   }
   public Student1(int rn, String nm)
   {
	   this.roll = rn;
	   this.name = nm;
   }
     public Student1(int roll, String name, int height, int weight,int age)
   {
	   this.age = age;
	   this.name = name;
	   this.height = height;
	   this.weight = weight;
	   this.roll = roll;
   }
     public Student1(int roll, String dept, String name)
	 {
		 this.roll = roll;
		 this.dept = dept;
		 this.name = name;
	 }
	 
   
   
   
}
