import java.util.Scanner;
class Addition{
    static void add(int a,int b){
        System.out.println("Addition of 2 numbers : " + (a+b));
    }
    static void add(int a,int b,int c){
        System.out.println("Addition of 3 numbers : " + (a+b+c));
    }
}
public class Addscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Addition.add(a, b);
        System.out.println("Enter another number : ");
        int c = sc.nextInt();
        Addition.add(a, b,c);
        sc.close();   
    }
}
