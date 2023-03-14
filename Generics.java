import java.util.ArrayList;
import java.util.Iterator;

public class Generics {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("madhuri");
        list.add("jaya");
        String s = list.get(1);
        System.out.println(s);
        String s1 = list.get(0);
        System.out.println(s1);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
