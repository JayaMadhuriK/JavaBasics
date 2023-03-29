import java.util.*;
public class DelDuplicate {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
       
       
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(20);
    
        System.out.println(list);
        
       for(int i = 0; i < list.size(); i++){
         
        
          for(int j = i+1;j<list.size();j++){
           
         
            if(list.get(i).equals(list.get(j))){
               
               list.remove(i);
               
            }
             
          }
          
        }
        System.out.println("after removal:"+list);
    }
}
