import java.util.*;
class Reverse {
    public static void main(String[] args){
        List<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        List<Integer> ll1 = new LinkedList<>();
      //  System.out.println(ll.size());
        for(int i=ll.size()-1;i>=0;i--){
           ll1.add(ll.get(i));
        }
        System.out.println(ll1);
    }
}
