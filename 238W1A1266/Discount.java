//Program for discount
import java.util.*;
class Discount
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter original amount : ");
  double org = sc.nextDouble();
  System.out.println("Enter offer price : ");
  double offer = sc.nextDouble();
  
  double discount = ((org-offer)/org)*100;
  
  System.out.println("The discount is " + discount + "%");
}
}