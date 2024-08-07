import java.util.*;
class Area2{
   int product;
   public Area2(int length,int breadth){
       this.product = length * breadth;
   }
   public Area2(int side){
       this.product = side * side;
   }
   public Area2(int a,int b,int c){
    int s = (a + b + c)/2;
    this.product = (int)Math.sqrt(s * (s-a) * (s-b) * (s-c));
   }
   public int getArea(){
    return this.product;
   }
}
class AreasConstructor{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 Area2 shape;
 //Rectangle area
 System.out.println("Enter length and breadth of rectangle : ");
 int length = sc.nextInt();
 int breadth = sc.nextInt();
    shape   = new Area2(length,breadth);
 int rectangle_area = shape.getArea();
 System.out.println("Area of rectangle : " + rectangle_area);
 //Square area
 System.out.println("Enter side of a square : ");
 int side = sc.nextInt();
    shape = new Area2(side);
 int square_area = shape.getArea();
 System.out.println("Area of square : " + square_area);
 //Triangle area
 System.out.println("Enter 3 sides of a triangle : ");
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
    shape = new Area2(a,b,c);
 int triangle_area = shape.getArea();
 System.out.println("Area of triangle : " + triangle_area);
 sc.close();
}

}