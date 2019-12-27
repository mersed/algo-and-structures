import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usNumberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaNumberFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaNumberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frNumberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usNumberFormat.format(payment));
        System.out.println("India: " + indiaNumberFormat.format(payment));
        System.out.println("China: " + chinaNumberFormat.format(payment));
        System.out.println("France: " + frNumberFormat.format(payment));
    }
}