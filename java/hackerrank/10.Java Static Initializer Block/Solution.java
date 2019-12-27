import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static boolean flag;
    private static int B;
    private static int H;

    static {
        try {
            Scanner scanner = new Scanner(System.in);
            flag = true;
            B = scanner.nextInt();
            H = scanner.nextInt();
            scanner.close();

            if(B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if(flag) {
            int area=B*H;
            System.out.print(area);
        }
    }
}
