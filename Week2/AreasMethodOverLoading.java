package Week2;

import java.util.Scanner;
class Area{
    public int area(int length,int breadth){
          return length*breadth;
    }
    public int area(int s){
          return s*s;
    }
    public int area(int a,int b,int c){
          int s = (a+b+c)/2;
          return (int)Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}
public class AreasMethodOverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area calculateArea = new Area();
        System.out.println("Enter length and breadth of the rectangle : ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int rectangle_area = calculateArea.area(length, breadth);
        System.out.println("Area of a rectangle : " + rectangle_area);

        System.out.println("Enter side of the square : ");
        int s = sc.nextInt();
        int square_area = calculateArea.area(s);
        System.out.println("Area of a square : " + square_area);

        System.out.println("Enter three sides of the triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int triangle_area = calculateArea.area(a, b, c);
        System.out.println("Area of a triangle : " + triangle_area); 
        sc.close();
    }
}
