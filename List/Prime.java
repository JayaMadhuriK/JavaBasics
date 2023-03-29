import java.util.*;
class Prime {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
       
       for(int i = 1 ;i<=50;i++){
        int fact = 0;
            for(int j = 1;j<=50;j++){
                if(i % j == 0){
                 fact++;
                }
            }
            if(fact==2){
                v.add(i);
            }
            
        }
        System.out.println(v);
    }

}
