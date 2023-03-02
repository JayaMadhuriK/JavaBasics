import java.util.*;
class SecondHighest{
 	public static void main(String args[]){
		int size,temp;
 		
		Scanner sc =new Scanner(System.in);
		System.out.print("enter size of array:");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter elements in array");
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
 		
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[size-2]+"is the second highest number in the array");
	}
}
		