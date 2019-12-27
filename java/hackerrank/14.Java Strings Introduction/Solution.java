import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int lengthSum = A.length() + B.length();
        String aGreatherThenB = (A.compareTo(B) > 0) ? "Yes" : "No";
        String Acap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String Bcap = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(lengthSum);
        System.out.println(aGreatherThenB);
        System.out.println(Acap + " " + Bcap);
    }
}