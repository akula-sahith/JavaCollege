import java.util.*;
class ArrayExceptions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks :");
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        try{
            System.out.println("Marks : ");
            for(int i= 0;i<=5;i++){
                System.out.println("Marks in subject " + (i+1) + " " + marks[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}