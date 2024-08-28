package Inheritance;

import java.util.Scanner;
abstract class Shape{
    double a;
    double b;
    public Shape(){}
    public Shape(double a,double b){
        this.a = a;
        this.b = b;
    }
    abstract double area();
}
class Rectangle extends Shape{
    public Rectangle(double a,double b){
        super(a,b);
    }
   double area(){
    return this.a * this.b;
   }
}

class Triangle extends Shape{
    public Triangle(double a,double b){
        super(a,b);
    }
    double area(){
        return 0.5 * this.a * this.b;
    }
}
public class AbstractInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of a rectangle : ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Shape rect = new Rectangle(l, b);
        double rect_area = rect.area();
        System.out.println("Area of a rectangle = " + rect_area);
        System.out.println("Enter base and height of a triangle : ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Shape train = new Triangle(base, height);
        double trian_area = train.area();
        System.out.println("Area of a Triangle = " + trian_area);
        sc.close();   
    }
}
