package Week4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string one : ");
        String s1 = sc.next();
        s1 = s1.trim();
        System.out.println("Enter string 2 : ");
        String s2 = sc.next();
        s2 = s2.trim();
        if (s1.length()!=s2.length()) {
            System.out.println("Not anagram");
        }else{
        char[] s1_array = s1.toCharArray();
        char[] s2_array = s2.toCharArray();
        Arrays.sort(s1_array);
        Arrays.sort(s2_array);
        boolean ans = true;
        for (int i = 0; i < s2_array.length; i++) {
            if(s1_array[i]!=s2_array[i]){
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not anagrams");
        }
        }
        
    }
}
