//Program to print 1 to 10 numbers using loops

class Loops{
public static void main(String[] args)
{
 
 //Using for loop
  System.out.println("Using for loop : ");
  for(int i = 1;i<=10;i++)
{
 System.out.print(i + " ");
}
 System.out.println();
 //Using while loop
 System.out.println("Using while loop : ");
 int j = 1;
 while(j<=10)
{
 System.out.print(j + " ");
 j++;
}
 //Using do while loop
 System.out.println();
 System.out.println("Using do while loop :  ");
 int h = 1;
 do
{
 System.out.println(h + " ");
 h++;
}while(h<=10);

}
}