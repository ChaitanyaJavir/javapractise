class Conversion
{
 public static void main(String[]args)
 {
  byte x = 127;
  short y = x;
  System.out.println("y value:"+y);
  short p = 125;
  byte q = (byte) p;
  System.out.println("q value:"+q);
  }
}