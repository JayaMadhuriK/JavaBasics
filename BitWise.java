import java.util.Scanner;
class BitWise{
	public static void main(String args[]){
		int a = 10;
		int i = a<<2;
		System.out.println("signed left shift:"+i);
		
		int b = 10;
		int j = b>>2;
		System.out.println("signed right shift:"+j);

		int c = 10;
		int k = c>>>2;
		System.out.println(" unsigned right shift:"+k);

		System.out.println("Bitwise inclusive OR: "+(a|b));
		System.out.println("Bitwise AND: "+(a&b));
		System.out.println("Bitwise exclusive OR: "+(a^b));
		System.out.println("Unary bitwise complement: "+(~c));
	}
}