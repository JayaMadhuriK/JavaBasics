import java.util.*;
class UniqueSet {
    public static void main(String args[]){
    Integer [] arr = new Integer[]{1,2,1,1,4,2,4,5,2};
    Set<Integer> hash = new HashSet<>();
    for(Integer i : arr){
    hash.add(i);
    }
    System.out.println(hash);
    
    }

}
