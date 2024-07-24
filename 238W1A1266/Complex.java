//Program to add 2 complex numbers
import java.util.*;
class Complex
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int a,b,c,d;
  System.out.println("Enter real value of number 1 : ");
  a = sc.nextInt();
   System.out.println("Enter imaginary value of number 1 : ");
  b = sc.nextInt();
  
  System.out.println("Enter real value of number 2 : ");
  c = sc.nextInt();
   System.out.println("Enter imaginary value of number 2 : ");
  d = sc.nextInt();
 
  int ansr = a + c;
  int ansi = b + d;

  System.out.println(ansr + " + " + ansi + "i"); 
}
}