class Addition{
    static void add(int a,int b){
        System.out.println("Addition of 2 numbers : " + (a+b));
    }
    static void add(int a,int b,int c){
        System.out.println("Addition of 3 numbers : " + (a+b+c));
    }
}
public class AddCLA {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        Addition.add(a, b);
        Addition.add(a, b, c);
    }
}
