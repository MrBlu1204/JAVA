//Given a string, S, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

//Note: You may find the String.split method helpful in completing this challenge.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
    scan.useDelimiter("\\Z");
    String s = scan.next().trim();
    if (s.length() > 0) {
        String[] tokens = s.split("[!,?._'@\\s]+");
        System.out.println(tokens.length);
        for(String token : tokens) {
            System.out.println(token);
        }
    } else {
        System.out.println(0);
    }
    scan.close();
    }
}
