import java.util.*;

abstract class Shape{

    abstract double perimeter();
    abstract double area();

}

class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    double length, breadth;
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }

    double area(){
        return length*breadth;
    }
}

public class RunTest{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter circle radius");
        double radius=sc.nextDouble();
        Circle cir = new Circle(radius);
       
        System.out.println("perimeter of the circle: ");
        double b = cir.perimeter();
        System.out.println(Math.round(b*100.0)/100.0);

        System.out.println("\narea of the circle: ");
        double d = cir.area();
        System.out.println(Math.round(d*100.0)/100.0);

        System.out.println("\nenter length and breadth of rectangle");
        double length=sc.nextDouble();
        double breadth=sc.nextDouble();
        Rectangle rec = new Rectangle(length,breadth);

        System.out.println("perimeter of the rectangle: ");
        System.out.println(rec.perimeter());

        System.out.println("\narea of the rectangle: ");
        System.out.println(rec.area());
        sc.close();
    }
}