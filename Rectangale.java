class Rectangale
{  
    public static void Area(int width, int height)
    { 
        int area = width*height;
		System.out.println("Area of rectangle="+area); 
	}
	 public static void main(String[]args)
	 {
		 System.out.println("main started!!");
		 
		 Rectangale obj = new Rectangale();
		  obj.Area(10,20);
		  
        System.out.println("main method ended!!");  
     }  
}  