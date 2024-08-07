import java.util.*;
class Area{
 public int area(int length,int breadth){
     return length*breadth;
 }
 public int area(int s){
     return s*s;
 }
 public int area(int a,int b,int c){
   int s = (a + b + c)/2;
   return (int)Math.sqrt(s * (s-a) * (s-b) * (s-c));
 }
}
class AreasMethod{

public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 Area calculateArea = new Area();
 //Rectangle area
 System.out.println("Enter length and breadth of rectangle : ");
 int length = sc.nextInt();
 int breadth = sc.nextInt();
 int rectangle_area = calculateArea.area(length,breadth);
 System.out.println("Area of rectangle : " + rectangle_area);
 //Square area
 System.out.println("Enter side of a square : ");
 int side = sc.nextInt();
 int square_area = calculateArea.area(side);
 System.out.println("Area of square : " + square_area);
 //Triangle area
 System.out.println("Enter 3 sides of a triangle : ");
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
 int triangle_area = calculateArea.area(a,b,c);
 System.out.println("Area of triangle : " + triangle_area);
 
}

}