import java.util.Scanner;
class RotateArray{
	
	public static void rotateLeft(int arr[],int n,int arraylength){
		for(int i=0;i<n;i++){
			rotateArrayLeft(arr,arraylength);
		}
	}

	public static void rotateRight(int arr[],int n,int arraylength){
		for(int i=0;i<n;i++){
			rotateArrayRight(arr,arraylength);
		}
	}
	
	public static void rotateArrayRight(int arr[],int n){
		int i,temp;
		temp = arr[n-1];
		for(i=n-1;i>0;i--){
			arr[i]=arr[i-1];
			
		}
		arr[i]=temp;
	}
	
	public static void rotateArrayLeft(int arr[],int n){
		int i,temp;
		temp = arr[0];
		for(i=0;i<n-1;i++){
			arr[i]=arr[i+1];
			
		}
		arr[i]=temp;
	}
	
	public static void main(String args[]){
		int arr[]={1,2,3,4,5};
		int r = 1;
		int arraylength = arr.length;
		System.out.println("Array before rotation: ");
		for(int i =0;i<arraylength;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		rotateLeft(arr,r,arraylength);
		System.out.println("array after 1 left rotation");
		for(int i =0;i<arraylength;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		rotateRight(arr,3,arraylength);
		System.out.println("array after 3 right rotation");
		for(int i =0;i<arraylength;i++){
			System.out.println(arr[i]+" ");
		}
	}
}