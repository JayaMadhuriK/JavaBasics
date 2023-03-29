import java.util.*;
class ArrayFList {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));
    
    }
}
