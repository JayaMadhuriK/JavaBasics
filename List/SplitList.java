import java.util.*;
public class SplitList {
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
       int c = v.size()/2;
       for(int i = 0 ;i <v.size();i++){
        if(i<c){
        v1.add(v.get(i));
        }
        else{
            v2.add(v.get(i));
        }
       }
       
        System.out.println("List: "+v);
        System.out.println("List after split into halves: ");
        System.out.println(v1);
        System.out.println(v2);
        
    }
}
