import java.util.Scanner;

public class KeyboardInput {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        /* Scanner is a class in util package, sc is a reference and new is used to create
           new object Scanner() is a constructor which is taking system input as a parameter
           System.in is same as System.out for printing
        */
        System.out.println(sc.next());
        System.out.println(sc.nextFloat());
        System.out.println(sc.nextDouble());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextBoolean());
        System.out.println(sc.nextLong());
        System.out.println(sc.nextShort());
        System.out.println(sc.nextInt()); /* These are some of methods to take input from keyboard
        Scanner acts as a pipeline to keyboard and program, methods will read input from keyboard
         and print it*/
    }
}
