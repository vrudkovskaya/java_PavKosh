package my.java.first.program;
import java.math.BigDecimal;
import java.util.ArrayList;

import static my.java.first.program.Mathematics.binomKoef;

public class SimpleProgram {

    public static void main (String[] args){
      System.out.println("I need to make a task!");

     Mathematics funcs = new Mathematics();
     //funcs.allFuncs(); //ПРОБНАЯ ФУНКЦИЯ

     //ВВОД НОМЕРА РЯДА В ТРЕУГОЛЬНИКЕ ПАСКАЛЯ
    while (funcs.getNumLine() == -1){
      System.out.println("Need to enter correct line number for Pascal triangle: [0; n]");
    }
    System.out.println("The line number of Pascal triangle:  " + funcs.numLine);
    System.out.println("Program starts to calculate list of numbers in " + funcs.numLine + "th line in Pascal triangle");

    // ВЫЧИСЛЕНИЕ ФАКТОРИАЛА
   /* System.out.print("Factorial 200! = ");
    System.out.println((funcs.fR(200)).toBigInteger().toString());*/

    // ВЫЧИСЛЕНИЕ ЧИСЕЛ В РЯДЕ КАКОМ-ТО ТРЕУГОЛЬНИКА ПАСКАЛЯ
    //funcs.numLine = 8;
    ArrayList<BigDecimal> lineResult = new ArrayList<BigDecimal>();

    int count = (int)Math.ceil((funcs.numLine+1) / 2.0);
    //System.out.println(count);

    for (int i = 0; i < count; i++) {
        BigDecimal temp = binomKoef(funcs.numLine, i);
        lineResult.add(temp);
        System.out.println("C(" + funcs.numLine + ", " + i + ") = " + binomKoef(funcs.numLine, i));
    }

    if ((int) Math.floor((funcs.numLine + 1) / 2.0) != count) {
       for (int i = count - 2; i >= 0; i--) {
           System.out.println("C(" + funcs.numLine + ", " + (funcs.numLine-i) + ") = " + lineResult.get(i).toBigInteger().toString());
       }
    } else {
        for (int i = count - 1; i >= 0; i--) {
            System.out.println("C(" + funcs.numLine + ", " + (funcs.numLine-i) + ") = " + lineResult.get(i).toBigInteger().toString());
            }
        }
  }
}