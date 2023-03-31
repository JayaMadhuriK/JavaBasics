import java.util.*;

class SumEven{
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        int sum = 0;
       
        v.add(9);
        v.add(20);
        v.add(11);
        v.add(40);
        for(Integer i :v){
            if(i%2 == 0){
                sum += i;
            }
           
        }
        System.out.println("elements in list: ");
        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println("sum of even elements: "+sum);
    }
}
