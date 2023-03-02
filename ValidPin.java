import java.util.*;
class ValidPin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String pin1;
		String pin2="123456";
		System.out.println("enter the pin: ");
		pin1 = sc.next();
		if(pin1.equals(pin2)==true){
			System.out.println("pin is valid");
		}
		else{
			System.out.println("pin is invalid");
		}
	}
}
		