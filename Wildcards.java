import java.util.Arrays;
import java.util.List;

class Wildcards{
	private static double sum(List<? extends Number> list) {    //upperbound
		double sum =0;
		for(Number i:list){
			sum += i.doubleValue();
		
		}
		return sum;
	}
	private static void print(List<? super Integer> list) {    //lowerbound
		System.out.println(list);
	}
	private static void printl(List<?> list) {
		System.out.println(list);
	}
	

	public static void main(String args[]){
		System.out.println("upperbound");
	
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println("total summ is "+sum(list));
		List<Double> list1 = Arrays.asList(1.5,2.3,3.4,4.8,5.2);
		System.out.println("total summ is "+sum(list1));
		
		System.out.println("lowerbound");

		List<Integer> list2 = Arrays.asList(1,2,3,4);
		print(list2);
		List<Number> list3 = Arrays.asList(3,4,5);
		print(list3);
        
		System.out.println("unbounded");

		List<Integer> list4 = Arrays.asList(1,2,3,4);
		printl(list4);
		List<Double> list5 = Arrays.asList(3.4,4.6,5.2);
		printl(list5);
	}
	
	
}