package Map;

import java.util.*;
class CountFreq {
    public static void main(String args[]){
       /*  ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(30);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer i : list){
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }
        Set<Integer> keys = map.keySet();
        for(Integer i : keys) {
            System.out.println(i+"-->"+map.get(i));
        }*/
        
        String s ="JayaMadhuri";
        char[] c =s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i : c){
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }

        Set<Character> keys = map.keySet();
        for(char i : keys) {
            System.out.println(i+"-->"+map.get(i));
            
        }
    }
}



