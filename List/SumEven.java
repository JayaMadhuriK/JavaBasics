import java.util.*;

class SumEven{
    public static void main(String args[]){
        List<Integer> v = new ArrayList<>();
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
        System.out.println("sum of even number in List: " + sum); 
    }
}
