import java.util.*;

class SumAvg{
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        int sum = 0;
        float avg;
        v.add(10);
        v.add(20);
        v.add(30);
        for(Integer i :v){
            sum += i;
        }
        avg = sum/v.size();
        System.out.println("sum of list"+sum);
        System.out.println("sum of list"+avg);
    }

 
}