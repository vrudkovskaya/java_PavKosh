package my.java.first.program;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PascalTriangle {

    public Integer numLine = Integer.valueOf(0);

    public static BigDecimal fR(Integer n) {
        BigDecimal f = BigDecimal.valueOf(1);
        if (n == 1 || n == 0) {
            return f;
        } else {
            for (int i = 1; i < n; i++) {
                f = f.multiply(BigDecimal.valueOf(i + 1));
            }
        }
        return f;
    }

    public static BigDecimal binomKoef(Integer n, Integer k) {
        BigDecimal koef = fR(n).divide((fR(k).multiply(fR(n - k))));
        return koef;
    }

    public static void calc(Integer numLine) {
        int count = (int) Math.ceil((numLine + 1) / 2.0);

        ArrayList<BigDecimal> lineResult = new ArrayList<BigDecimal>();
        for (int i = 0; i < count; i++) {
            BigDecimal temp = binomKoef(numLine, i);
            lineResult.add(temp);
            System.out.print(temp.toBigInteger().toString() + " ");
        }

        if ((int) Math.floor((numLine + 1) / 2.0) != count) {
            for (int i = count - 2; i >= 0; i--) {
                System.out.print(lineResult.get(i).toBigInteger().toString() + " ");
            }
        } else {
            for (int i = count - 1; i >= 0; i--) {
                System.out.print(lineResult.get(i).toBigInteger().toString() + " ");

            }
        }

    }

    public static void main(String[] args) {
        System.out.println("I need to make a task!");

        Integer numLine = Integer.valueOf(0);
        if (args.length > 0) {
            try {
                numLine = Integer.decode(args[0]) - 1;
                System.out.println("The line number of Pascal triangle:  " + (numLine + 1));
                System.out.println("");
                System.out.println("Program starts to calculate list of numbers in " + (numLine + 1) + "th line in Pascal triangle \n");
                System.out.println("");
                calc(numLine);
            } catch (NumberFormatException ex) {
                System.out.println("Need to enter correct line number for Pascal triangle: [0; n]");
                System.out.println("");
                System.out.println("The line number of Pascal triangle:  NOT entered");
            }
        }

    }
}