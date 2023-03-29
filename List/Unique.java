import java.util.*;
class Unique {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hash = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(30);
        hash.addAll(list);
        list.clear();
        list.addAll(hash);
        
        
      System.out.println(list);
      
    } 
}

