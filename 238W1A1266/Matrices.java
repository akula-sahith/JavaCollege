//Program for the multiplication of the matrices
import java.util.*;
class Matrices
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int n,m;
 System.out.println("Enter order of matrix 1 : ");
 n = sc.nextInt();
 System.out.println("Enter order of matrix 2 : ");
 m = sc.nextInt();
 int[][] a = new int[n][n];
 int[][] b = new int[m][m];
  System.out.println("Enter elements 1 : ");
 for(int i = 0;i<n;i++)
 {
 for(int j = 0;j<m;j++)
 {
   a[i][j] = sc.nextInt();
 }
 }

 System.out.println("Enter elements 2 : ");
 for(int i = 0;i<n;i++)
 {
 for(int j = 0;j<m;j++)
 {
   b[i][j] = sc.nextInt();
 }
 }

 int[][] c = new int[n][n];

 for(int i = 0;i<n;i++)
 {
 for(int j = 0;j<m;j++)
 {
   c[i][j] = 0;
 for(int k = 0;k<n;k++)
 {
  c[i][j] = c[i][j] + (a[i][k] * b[k][i]);
 }
 }
 }

 System.out.println("Answer matrix : ");

 for(int i = 0;i<n;i++)
 {
 for(int j = 0;j<m;j++)
 {
   System.out.print(c[i][j] + " ");
 }
 System.out.println();
 }
 

}
}