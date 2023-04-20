package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        String us, i, ch, fr;
        us = NumberFormat.getCurrencyInstance(Locale.US).format( payment);
        i = NumberFormat.getCurrencyInstance(new Locale("en","in")).format( payment);
        ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format( payment);
        fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format( payment);
        System.out.println("US: " + us);
        System.out.println("India: " + i);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }

}
