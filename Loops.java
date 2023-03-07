import java.util.Scanner;
class Loops{
	public static void main(String args[]){
		int a = 0,fact = 1;
		System.out.println("For loop for displaying multiplication table");
		for(int i = 1;i<=10;i++){
			System.out.println("2 * "+i+" = "+(2*i)); 
		}
		
		System.out.println("For loop for finding sum of num numbers");
		for(int i=1;i<=10;i++){
			a = a+i;
		}
		System.out.println("sum of first 10 numbers: "+a);
	
		System.out.println("For loop for finding Factorial of number");
		for(int i=5;i>0;i--){
			fact = fact * i;
		}
		System.out.println("factorial of 5: "+fact);

		System.out.println("For loop for displaying digits 1-10");
		for(int i = 1;i<=10;i++){
			System.out.println(i); 
		}

		System.out.println("For loop for finding a number is armstrong");
		int num=154,r,rev=0;
		int n =num;
		do{
			
			r=n%10;
			rev=rev+(r*r*r);
			n=n/10;
		}while(n>0);

		if(num==rev){
			System.out.println("Armstrong");
		}
		else{
			System.out.println("not a Armstrong");
		}

		System.out.println("Reverse a number");
		int num1=154,r1,rev1=0;
		int n1 =num1;
		do{
			
			r1=n1%10;
			rev1=rev1*10+r1;
			n1=n1/10;
		}while(n1>0);
		System.out.println("reverse of number "+num1+" is "+rev1);

		System.out.println("check if number is palindrome or not");
		int num2=151,r2,rev2=0;
		int n2 =num2;
		do{
			
			r2=n2%10;
			rev2=rev2*10+r2;
			n2=n2/10;
		}while(n2>0);
		if(num2==rev2){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not a Palindrome");
		}
			

		System.out.println("patterns1");
		for(int i=1;i<=3;i++){
			System.out.println(i);
			System.out.println("1 2 3 4");
		}
		
		System.out.println("patterns2");
		int m=65;
		for(int i=1;i<=5;i++){
				for(int j=1;j<=i;j++){
					System.out.print((char)m+" ");
			        }
			m++;
			System.out.println();
		}

		System.out.println("patterns3");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}
}