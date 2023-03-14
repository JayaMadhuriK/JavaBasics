
class GenericsExample<T>{               //generic class
	T t;                                //object of type T
	GenericsExample(T t){
		this.t = t;
	}
	public T getObject(){
		return this.t;
	}
}
class GenericsExample1{
	public static void main(String args[]){
		GenericsExample<Integer> obj = new GenericsExample<Integer>(12);
		System.out.println(obj.getObject());
		GenericsExample<String> obj1 = new GenericsExample<String>("madhuri");
		System.out.println(obj1.getObject());
		
		

	}
}