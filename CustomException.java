
class CustomException extends Exception{
	String str;
	CustomException(String m){
		str = m;
	}
	public String toString(){
		return("custom exception:"+str);
	}
	public static void main(String args[]){
		try{

			throw new CustomException("this is the example exception");
		
		}
		catch(CustomException ce){
			System.out.println(ce);
		}
	}	
}