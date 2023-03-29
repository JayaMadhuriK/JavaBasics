import java.util.*;
class AscDesc {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        list.add(15);
        list.add(25);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
