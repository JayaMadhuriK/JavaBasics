import java.util.Scanner;
class Cal
{
  public static void main(String args[])
  {
   float a,b,res; 
   Scanner sc = new Scanner(System.in);
   System.out.println("enter a and b values");
   a=sc.nextFloat();
   b=sc.nextFloat();
   res=a+b;
   System.out.println("sum of two numbers"+res);
   res=a*b;
   System.out.println("multiplication of two numbers"+res);
   res=a-b;
   System.out.println("subtraction of two numbers"+res);
   res=a/b;
   System.out.println("divison of two numbers"+res);
   res=a%b;
   System.out.println("remainder of two numbers"+res);
  }
}