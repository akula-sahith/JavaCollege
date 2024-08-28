package Week4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer token = new StringTokenizer(s);
        System.out.println(token.countTokens());
        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
    }
}
