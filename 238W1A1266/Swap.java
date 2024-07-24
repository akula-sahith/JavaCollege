//Write a program to swap 2 numbers
import java.util.*;
class Swap
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter number 1 : ");
  int a = sc.nextInt();
  System.out.println("Enter number 2 : ");
  int b = sc.nextInt();
  
   System.out.println("Before swapping : ");
   System.out.println("a = " + a);
   System.out.println("b = " + b);
   int temp = a;
   a = b;
   b = temp;
   System.out.println("After swapping : ");
   System.out.println("a = " + a);
   System.out.println("b = " + b);
   
   
}
}