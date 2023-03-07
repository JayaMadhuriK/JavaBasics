import java.util.Scanner;
class QuadraticRoots{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,b and c values:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double root1 = (b*b)-(4*a*c);
		System.out.println(root1);
		double root2,root3;
		if(root1>0){
		root2 = (-b + Math.sqrt(root1))/(2*a);
		root3 = (-b - Math.sqrt(root1))/(2*a);
		System.out.println("root is"+root2+"  or  "+root3);
		}
		else if(root1 == 0){
		root2 = root3 = -b/(2*a);
		System.out.println("root is:"+root2);
		}
		else{
		double real = -b/(2*a);
		double imaginary = Math.sqrt(-root1)/(2*a);
		System.out.println("real part is:"+real);
		System.out.println("imaginary part is:"+imaginary);
		}
	}
}


		