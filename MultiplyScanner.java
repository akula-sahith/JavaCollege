import java.util.Scanner;
class Multiply{
    static void product(int a,int b){
        System.out.println("Product of 2 numbers : " + (a*b));
    }
    static void product(int a,int b,int c){
        System.out.println("Product of 3 numbers : " + (a*b*c));
    }
}
public class MultiplyScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Multiply.product(a, b);
        System.out.println("Enter another number : ");
        int c = sc.nextInt();
        Multiply.product(a, b,c);
        sc.close();   
    }
}
