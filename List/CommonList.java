import java.util.*;
class CommonList{
    public static void main(String args[]){
        Vector<Integer> v = new Vector<>();
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(50);
        v2.add(10);
        v2.add(50);
        v2.add(30);
        v2.add(40);
       
        System.out.println(v1);
        System.out.println(v2);
        for (int i = 0;i<v1.size();i++) {
            if(v2.contains(v1.get(i))){
                v.add(v1.get(i));
            }
        }
        System.out.println(v);
    }
}
