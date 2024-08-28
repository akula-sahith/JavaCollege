class Multiply{
    int product;
    public Multiply(int a,int b){
    //    this.a = a;
    //    this.b = b;
       this.product = a*b;
    }
    public Multiply(int a,int b,int c){
        // this.a = a;
        // this.b = b;
        // this.c = c;
        this.product = a*b*c;
    }
    
    public void displayproduct(){
        System.out.println("Product : " + product);
    }
}
public class MultiplicationCon2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        Multiply mul = new Multiply(a, b);
        mul.displayproduct();
        mul = new Multiply(a, b, c);
        mul.displayproduct();
    }
}
