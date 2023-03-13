
class ThrowThrows{
	void div(int a, int b) throws ArithmeticException{    //exception is declared and pass to caller method(used in method signature)
		System.out.println("division");
		if(b==0){
			throw new ArithmeticException("b is zero");  //exception object is created for explicit throw
		}
		else{
		    int c = a/b;
			System.out.println(c);
		}
	}
	public static void main(String args[]){
		ThrowThrows t = new ThrowThrows();
	
		try{
			t.div(20,0);
		}
		catch(ArithmeticException e){
			System.out.println("b value is zero");
		}
		System.out.println("program completed");
		
	}
}