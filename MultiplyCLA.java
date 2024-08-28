class Multiplication{
    static void product(int a,int b){
        System.out.println("Product of 2 numbers : " + (a*b));
    }
    static void product(int a,int b,int c){
        System.out.println("Product of 3 numbers : " + (a*b*c));
    }
}
public class MultiplyCLA {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        Multiplication.product(a, b);
        Multiplication.product(a, b, c);
    }
}
