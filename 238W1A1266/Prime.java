//Program to print prime numbers between 1 to 100
import java.util.*;
class Prime
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 for(int i = 2 ; i<=100;i++){
    if(isPrime(i)){
     System.out.println(i + " ");
    }
 }
}
static boolean isPrime(int n){
 boolean ans = true;
 int i = 2;
 while(i<n){
  if(n%i==0){
    return false;
  }
   i++;
 }
 return true;
}
}