//Program to demonstrate one dimensional array
import java.util.*;
class Array
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int n;
  System.out.println("Enter number of elements : ");
  n = sc.nextInt();
  int[] arr = new int[n];
  
  for(int i = 0;i<n;i++)
{
  arr[i] = i + 1;
}
 
 for(int i = 0;i<n;i++)
{
  System.out.print(arr[i] + " ");
}

}
}