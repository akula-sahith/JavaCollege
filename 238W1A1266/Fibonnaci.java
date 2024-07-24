//Program to print first 100 fibonnaci numbers
import java.util.*;
class Fibonnaci
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int a = 0;
 int b = 1;
 int i = 2;
 int n = 100;
 System.out.println(a);
 System.out.println(b);
 while(i<n){
  int temp = a + b;
  System.out.println(temp);
  a = b;
  b = temp;
  i++;
 }
}
}