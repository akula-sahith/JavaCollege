//Program to print armstrong numbers between 100 to 999
import java.util.*;
class Armstrong
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 for(int i = 100 ;i<=999;i++){
 if(isArm(i)){
   System.out.println(i + " ");
 }
 }
}
static boolean isArm(int n){
 int temp = n;
 int sum = 0;
 while(temp>0)
 {
 int r = temp%10;
 sum += Math.pow(r,3);
 temp = temp/10;
 }
 if(sum==n){
 return true;
 } 

 return false;
}
}