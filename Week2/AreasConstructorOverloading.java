package Week2;

import java.util.Scanner;

class Area2{
    int area;
    public Area2(int length,int breadth){
        this.area = length*breadth;
    }
    public Area2(int s){
        this.area = s*s;
    }
    public Area2(int a,int b,int c){
        int s = (a+b+c)/2;
        this.area = (int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public int getArea(){
        return area;
    }
}
public class AreasConstructorOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle : ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Area2 rect = new Area2(length, breadth);
        int rectangle_area =rect.getArea();
        System.out.println("Area of a rectangle : " + rectangle_area);

        System.out.println("Enter side of the square : ");
        int s = sc.nextInt();
        Area2 squa = new Area2(s);
        int square_area = squa.getArea();
        System.out.println("Area of a square : " + square_area);

        System.out.println("Enter three sides of the triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Area2 trian = new Area2(a, b, c);
        int triangle_area = trian.getArea();
        System.out.println("Area of a triangle : " + triangle_area); 
        sc.close();
    }
}
