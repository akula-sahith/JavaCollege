//Calculate sum using commmad line arguments
import java.util.*;
class SumCmd
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int a,b = 0;
 try{
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
 }catch(Exception e)
 {
   System.out.println("Command line arguments are missing!!");
   System.out.println("Enter number 1 : ");
   a = sc.nextInt();
   System.out.println("Enter number 2 : ");
   b = sc.nextInt();
 }
 
 int ans = a + b;
 System.out.println("Sum : " + ans);
}
}