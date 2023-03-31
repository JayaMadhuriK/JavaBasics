import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo {
    public static void main(String args[]){
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(31);
        System.out.println(l);
        List<Integer> n = l.stream().filter(q->q%2==0).collect(Collectors.toList());
        System.out.println(n);
        List<Integer> n1 = l.stream().map(q->q*q).collect(Collectors.toList());
        System.out.println(n1);
    }
}
