import java.util.Scanner;
import java.util.regex.*;
class ValidPin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		
		Pattern p = Pattern.compile(regex);

		System.out.println("enter the pin: ");
		String pincode = sc.nextLine();

		if(pincode == null){
			System.out.println("invalid pincode");
		}

		Matcher m = p.matcher(pincode);
		
		System.out.println(m.matches());
		sc.close();
	}
}
		