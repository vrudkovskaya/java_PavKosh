package my.java.first.program;
import java.math.BigDecimal;
import java.util.Scanner;

public class Mathematics {
    public int numLine = 0;

    public int getNumLine(){
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()){
            numLine = in.nextInt();
            return numLine;
        }
        else
            return -1;
    }

    public static BigDecimal fR(Integer n){
        BigDecimal f = BigDecimal.valueOf(1);
        if (n == 1 || n == 0)
            return f;
        else
            for (int i = 1; i < n; i++){
                f = f.multiply(BigDecimal.valueOf(i+1));
            }

        return f;
    }

    public static BigDecimal binomKoef(Integer n, Integer k) {
        BigDecimal koef = fR(n).divide((fR(k).multiply(fR(n - k))));
        return koef;
    }

    public void allFuncs(){
        System.out.println(2+2);
        System.out.println(2-2);
        System.out.println(2*2);
        System.out.println(2/2);
        System.out.println(1.0/2);
    }
}
