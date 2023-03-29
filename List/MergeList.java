import java.util.*;
public class MergeList {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("madhuri");
        list.add("madhu");
        list.add("Jaya");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("madhu");
        list1.add("Jaya");
        list1.add("Madhuri");
       
      //  ArrayList<String> list2 = new ArrayList<>();
       /* for(String s : list){
            list2.add(s);
        }                                    //low performance
        for(String s : list1){
            list2.add(s);
        }*/
       // list2.addAll(list);              //high performance
       // list2.addAll(list1);
        System.out.println(list);
        System.out.println(list1);
        list.addAll(list1);
        System.out.println("merging the 2 lists");
        System.out.println(list);

    }
}
