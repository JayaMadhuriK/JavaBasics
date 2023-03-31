
import java.util.*;
public class Demo {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("deleting "+q.peek());
        q.poll();
        System.out.println(q);
    }
}
