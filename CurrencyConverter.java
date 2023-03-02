import java.util.*;
class CurrencyConverter{
 	public static void main(String args[]){
		double amount,pound,dollar,rupee,euro;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter amount in rupee to be convert: ");
		amount = sc.nextInt();
		System.out.println("1.Dollar\n 2.Pound\n 3.Euro");
		System.out.print("enter any above choice: ");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				dollar = amount/82.55;
                		System.out.println("rupees to dollar"+amount+"rs --->"+dollar+"$");
				break;
			case 2:
				pound = amount/98.62;
		 		System.out.println("rupees to pound"+amount+"rs --->"+pound+"£");
				break;
			case 3:
				euro = amount/87.58;
				System.out.println("rupees to euro"+amount+"rs --->"+euro+"€");
				break;
			default:
				System.out.println("invalid choice");
				break;
		}
	}
}
	
