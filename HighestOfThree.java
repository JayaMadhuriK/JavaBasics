import java.util.*;
class HighestOfThree{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,b and c values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
			
		if(a>b && a>c){
			System.out.println(a+" is the highest");
		}
		else if(b>a && b>c){
			System.out.println(b+" is the highest");
		}
		else{
			System.out.println(c+" is the highest");
		}
	}
}