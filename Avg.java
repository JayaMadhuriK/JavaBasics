import java.util.Scanner;
class Avg
{
  public static void main(String args[])
  {
   float a,b,c;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter a,b and c values");
   a=sc.nextFloat();
   b=sc.nextFloat();
   c=sc.nextFloat();
   System.out.println((a+b+c)/3);
  }
}