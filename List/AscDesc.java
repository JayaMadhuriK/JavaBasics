import java.util.*;
class AscDesc {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        list.add(15);
        list.add(25);
        System.out.println(list);
        System.out.println("Ascending order");
        Collections.sort(list);    //bydefault Ascending order
        ListIterator<Integer> lt = list.listIterator();
        while(lt.hasNext()){
            System.out.println(lt.next());
        }
        System.out.println("descending order");
        Collections.reverse(list);    //bydefault Descending order
        ListIterator<Integer> lt1 = list.listIterator();
        while(lt1.hasNext()){
            System.out.println(lt1.next());
        }

    }
}
