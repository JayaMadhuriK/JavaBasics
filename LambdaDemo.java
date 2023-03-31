
interface Demo{
    abstract int sum(int a, int b);
}

public class LambdaDemo {
    public static void main(String args[]){
       
        Demo d = (x,b) -> (x+b);
        System.out.println("adding two elements: "+d.sum(10,20));
    }
}
