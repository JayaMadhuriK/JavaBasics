import java.util.*;

abstract class Shape{

    abstract double perimeter(double a, double b);
    abstract double area(double a, double b);

}

class Circle extends Shape{

    double perimeter(double pie,double radius ){
        return 2*pie*radius;
    }

    double area(double pie,double radius){
        return pie*radius*radius;
    }
}

class Rectangle extends Shape{

    double perimeter(double length, double breadth){
        return 2*(length+breadth);
    }

    double area(double length, double breadth){
        return length*breadth;
    }
}

public class RunTest{
    public static void main(String args[])
    {
        Circle cir = new Circle();
        Rectangle rec = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter circle radius");
        double radius=sc.nextDouble();
        double pie=3.14;

        System.out.println("perimeter of the circle: ");
        double c = cir.perimeter(pie,radius);
        System.out.format("%.3f",c);

        System.out.println("\narea of the circle: ");
        System.out.println(cir.area(pie,radius));


        System.out.println("enter length and breadth of rectangle");
        double length=sc.nextDouble();
        double breadth=sc.nextDouble();

        System.out.println("perimeter of the rectangle: ");
        System.out.println(rec.perimeter(length,breadth));

        System.out.println("area of the rectangle: ");
        System.out.println(rec.area(length,breadth));
        sc.close();
    }
}