import java.util.*;
class Unique {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
       
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(30);
        list.add(20);
        List<Integer> list1 = new ArrayList<>();
       
       /* HashSet<Integer> hash = new HashSet<>(list);
        list.clear();
        list.addAll(hash); */
        for(int i = 0; i < list.size(); i++){
      
         if(list1.contains(list.get(i))){
           list.remove(i);
         }
         else{
          list1.add(list.get(i));
         }
          
        }
      System.out.println(list);
      System.out.println(list1);
      
    } 
}

