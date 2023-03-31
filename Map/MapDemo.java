
import java.util.*;
public class MapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println(map);
        Set<Integer> s = map.keySet();
        for(Integer i :s){
            System.out.println(i);           //key retrieving
        }
        Collection<String> s1 = map.values();
        for(String i :s1){                         //values retrieving
            System.out.println(i);
        }
    }
}
