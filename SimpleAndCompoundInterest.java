import java.util.*;
import java.io.*;
class SimpleAndCompoundInterest {

	private static float simpleInterest (int principle, int time, float rateOfInterest) {

		float simpleInterest = 0;

		simpleInterest=(principle*time*rateOfInterest)/100;
       
   		return simpleInterest;
	} 

	private static double compoundInterest (int principle, int time, float rateOfInterest) {

		double compoundInterest = 0;

		compoundInterest=principle*(Math.pow((1+rateOfInterest/100),time))-principle;
       
   		return compoundInterest;
	} 

        public static void main(String args[])
	{
	 int principle,time;
         float rateOfInterest;
	 Scanner sc = new Scanner(System.in);
 	 System.out.println("simple interest");
	 System.out.print("enter principle amount: ");
	 principle=sc.nextInt();
	 System.out.print("enter time: ");
	 time=sc.nextInt();
	 System.out.print("enter rateOfInterest: ");
	 rateOfInterest=sc.nextFloat();
	 System.out.print("simple interest will be: ");
         System.out.print(simpleInterest(principle, time, rateOfInterest));
	 System.out.println();
 	 System.out.print("compound interest");
	 System.out.println();
	 System.out.print("enter principle amount: ");
	 principle=sc.nextInt();
	 System.out.print("enter time: ");
	 time=sc.nextInt();
	 System.out.print("enter rateOfInterest: ");
	 rateOfInterest=sc.nextFloat();
	 System.out.print("compound interest will be: ");
         System.out.print(compoundInterest(principle,time, rateOfInterest));
         
	}
}
