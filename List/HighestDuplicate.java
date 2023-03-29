import java.util.*;
public class HighestDuplicate {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
       
       
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(20);
    
        System.out.println(list);
        int count=0;
        
       for(int i = 0; i < list.size(); i++){
         
        
          for(int j = i+1;j<list.size();j++){
           
         
            if(list.get(i).equals(list.get(j))){
               
                count++; 
                break;
            }
             
          }
          
        }
        System.out.println(count);
    }
}
