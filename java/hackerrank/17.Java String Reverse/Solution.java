import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int strLength = A.length();
        int boundary = (int)Math.ceil((float)A.length()/2);

        boolean isPalindrome = true;
        for(int i=0; i<boundary; i++) {
            if(A.charAt(i) != A.charAt(strLength-1-i)) {
                isPalindrome = false;
                break;
            }
        }

        String palindromeText = isPalindrome ? "Yes" : "No";
        System.out.println(palindromeText);
    }
}