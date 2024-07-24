//Program to calculate simple interest
import java.util.*;
class SimpleInterest
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int p,r,t;
  System.out.println("Enter principle amount : ");
  p = sc.nextInt();
   System.out.println("Enter rate of interest : ");
   r = sc.nextInt();
   System.out.println("Enter time : ");
   t = sc.nextInt();
   int SI = (p*r*t)/100;
   System.out.println(SI);
}
}