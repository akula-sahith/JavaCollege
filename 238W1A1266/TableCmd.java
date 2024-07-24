//Program to print table using command line arguments
import java.util.*;

class TableCmd
{
interface TableCalculator
{
 void calculate(int i);
}
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 TableCalculator table = (int i) ->
  {
    for(int j = 1;j<=10;j++)
    {
      System.out.println(i + " * " + j + " = " + (i*j));
    }
  };
 
 int i = 0;

 try{
    i = Integer.parseInt(args[0]);
 }catch(Exception e)
 {
 System.out.println("Commad line arguments are missing!!");
 System.out.println("Enter which table to print!!!!");
 i = sc.nextInt();
 }
 
 table.calculate(i);
 
}
}