package Inheritance;

import java.util.Scanner;
@FunctionalInterface
interface Shapes{
    abstract double calculateArea(double... dimens);
}
public class AreasOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shapes shape;
        while (true) {
        System.out.println("Select a shape to calculate : ");
        System.out.println("1.Square");
        System.out.println("2.Rectangle");
        System.out.println("3.Normal triangle");
        System.out.println("4.Right angle triangle");
        System.out.println("5.Circle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: 
                   System.out.println("Enter side of the square!!");
                   double side = sc.nextDouble();
                   shape =  (dimens) -> dimens[0] * dimens[0];     
                   double square_area = shape.calculateArea(side);
                   System.out.println("Area of a square :  " + square_area);
                break;
            case 2: 
                   System.out.println("Enter length and breadth : ");
                   double length = sc.nextDouble();
                   double breadth = sc.nextDouble();
                   shape =  (dimens) -> dimens[0] * dimens[1];     
                   double rect_area = shape.calculateArea(length,breadth);
                   System.out.println("Area of a Rectangle :  " + rect_area);
             break;
             case 3:
                   System.out.println("Enter 3 sides of a triangle : ");
                   int a = sc.nextInt();
                   int b = sc.nextInt();
                   int c = sc.nextInt();
                   shape = (dimens) -> {
                      double s = (dimens[0] + dimens[1] + dimens[2])/2;
                      return Math.sqrt(s * (s - dimens[0]) * (s - dimens[1]) * (s - dimens[2]));
                   };
                   double trian_area = shape.calculateArea(a,b,c);
                   System.out.println("Area of a triangle : " + trian_area);
                   break;
             case 4:
                   System.out.println("Enter base and height of a right angle triangle : ");
                   double base = sc.nextDouble();
                   double height = sc.nextDouble();
                   shape =  (dimens) -> (0.5 * dimens[0] * dimens[1]);     
                   double right_area = shape.calculateArea(base,height);
                   System.out.println("Area of a right angle triangle : " + right_area);
                   break;
             case 5:
                   System.out.println("Enter radius of the circle : ");
                   double radius = sc.nextDouble();
                   shape =  (dimens) -> Math.PI * dimens[0] * dimens[0];     
                   double circle_area = shape.calculateArea(radius);
                   System.out.println("Area of a square :  " + circle_area);
                   break;
            default:
                break;
        }
    }
}
}
