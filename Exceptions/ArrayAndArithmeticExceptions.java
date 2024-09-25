import java.util.*;
class ArrayAndArithmeticExceptions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
           int a = 10/0;
           System.out.println(a);
        }catch(ArithmeticException e){
           System.out.println(e);
        }

        try{
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (i + 1);
            }
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}