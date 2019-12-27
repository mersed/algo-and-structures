import java.util.*;
import java.io.*;



class Solution{
    static final int maxInt = (int)(Math.pow(2, 31) - 1);
    static final int minInt = (int)(-Math.pow(2, 31));
    static final long maxLong = (long)(Math.pow(2, 63) - 1);
    static final long minLong = (long)(-Math.pow(2, 63));

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x>=-128 && x<=127) System.out.println("* byte");
                if(x>=-32768 && x<=32767) System.out.println("* short");
                if(x>=-minInt && x<=maxInt) System.out.println("* int");
                if(x>=-minLong && x<=maxLong) System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}