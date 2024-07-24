//Program to find lcm of 2 numbers
import java.util.*;
class LCM
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter number 1 : ");
  int a = sc.nextInt();
  System.out.println("Enter number 2 : ");
  int b = sc.nextInt();
  
  int lcm = (a*b)/gcf(a,b);

  System.out.println("LCM : " + lcm);
}
static int gcf(int a , int b)
 {
  while(b!=0){
   int r = a%b;
   a = b;
   b = r;
  }

  return a;
 }
}