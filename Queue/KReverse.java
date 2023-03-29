package Queue;


import java.util.*;
class KReverse {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        System.out.println("enter how many values to print in reverse: ");
        int rev = sc.nextInt();
        System.out.println("elements in the queue");
        System.out.println(queue);
        for(int i = 0;i<rev;i++){
           stack.push(queue.poll());
        }
       // System.out.println(queue);
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
      //  System.out.println(stack.size());

        for(int i = 0;i<queue.size()-rev;i++){
            queue.offer(queue.poll());
         }
         //System.out.println(queue);
         Iterator<Integer> it = queue.iterator();
         System.out.println("elements after reversing first "+rev+" values");
         while(it.hasNext()){
            System.out.println(it.next());
         }
         sc.close();
    }

}
