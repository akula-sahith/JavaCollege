package Week4;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Commas {
    public static void main(String[] args) {
        // The input string provided in the problem
        String input = "It sometimes, happens that, while using, Microsoft Word you, hicave to transfer, copied table, to normal line – you need, to have your words, in one line separated, by let's say commas. While this procedure, would require, lot of clicking, and manual deleting, Microsoft Word possesses, a function that allows, you to do this automatically, disregarding how, many words you, need to transform";

        // Remove any unnecessary spaces or special characters that might have been misused
       StringTokenizer token = new StringTokenizer(input,",");
       while (token.hasMoreTokens()) {
          System.out.println(token.nextToken());
       }
    }
}
