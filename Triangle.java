import java.util.Scanner;

class Triangle{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		float base, height;
                System.out.println("enter base and height values:");
		base = sc.nextFloat();
		height = sc.nextFloat();
		float area = (base * height)/2;
		System.out.println("area of triangle"+area);
	}
}