
class Equals{
	public static void main(String args[]){
		String s1 = new String("madhuri");
		
		String s2 = "madhuri";
		String s3 = "madhuri";

		System.out.println("using equals() method :");
		System.out.println("s1 and s2 values are equal: "+s1.equals(s2));   //checks whether the value of s1 is equal to s2
		System.out.println("s2 and s3 values are equal: "+s2.equals(s3));   //checks whether the value of s2 is equal to s3
		System.out.println(); 
		System.out.println("using == :");
		System.out.println("s1 and s2 addresses are equal: "+(s1==s2));   //checks whether the address of s1 is equal to s2
		System.out.println("s2 and s3 addresses are equal: "+(s2==s3));   //checks whether the address of s2 is equal to s3

	}
}