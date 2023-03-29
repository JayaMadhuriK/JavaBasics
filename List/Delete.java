import java.util.*;
public class Delete {
   public static void main(String args[]){
    List<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(40);
    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(20);
    list1.add(50);

    System.out.println(list);
    System.out.println(list1);
    System.out.println(list.indexOf(40));   //print position of element
    System.out.println("removing list1 values in list: "+list.removeAll(list1));
    System.out.println(list);
   } 
}
