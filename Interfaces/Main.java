package Interfaces;

import java.util.*;
 interface Relatable {
   public boolean isLargerThan(Object obj);   
 }
 class Rectangle implements Relatable{
    int length;
    int breadth;
    int area;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }

    public boolean isLargerThan(Object obj){
        Rectangle rect = (Rectangle)obj;
        return this.area > rect.area;
    }  
}
class Triangle implements Relatable{
    int a;
    int b;
    int c;
    int area;
    public Triangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
        int s = (a + b + c)/2;
        this.area = (int)Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public boolean isLargerThan(Object obj){
        Triangle triangle = (Triangle)obj;
        return this.area > triangle.area;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = new Rectangle(7, 8);
        if(r1.isLargerThan(r2)){
            System.out.println("R1 is greater with area " + r1.area);
        }else{
            System.out.println("R2 is greater with area " + r2.area);
        }

        Triangle t1 = new Triangle(4, 5, 6);
        Triangle t2 = new Triangle(6, 7, 8);
        System.out.println(t1.area);
        System.out.println(t2.area);
        if(t1.isLargerThan(t2)){
            System.out.println("The larger area is : " + t1.area);
        }else{
            System.out.println("The larger area is : " + t2.area);
        }
    }  
}
