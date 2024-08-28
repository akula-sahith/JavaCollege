import java.util.Scanner;

class Mul{
    int product;
    public Mul(int a,int b){
       this.product = a*b;
    }
    public Mul(int a,int b,int c){
        this.product = a*b*c;
    }
    
    public void displayproduct(){
        System.out.println("Product : " + product);
    }
}
public class MultiplicationCon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Mul mul = new Mul(a, b);
        mul.displayproduct();
        mul = new Mul(a, b, c);
        mul.displayproduct();
        sc.close();
    }
}
