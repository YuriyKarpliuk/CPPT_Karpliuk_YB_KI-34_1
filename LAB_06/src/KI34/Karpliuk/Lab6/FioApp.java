package KI34.Karpliuk.Lab6;


import java.io.*;
import java.util.*;

/**
 * Class <code>FioApp</code>  Implements driver for CalcWFio class
 * calculation
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class FioApp {
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
        CalcWFio calcWFio = new CalcWFio();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = s.nextInt();
        calcWFio.calculate(x);
        System.out.println("y =  " + calcWFio.getY());
        calcWFio.writeResTxt("textRes.txt");
        calcWFio.writeResBin("BinRes.bin");
        calcWFio.readResBin("BinRes.bin");
        System.out.println("y =  " + calcWFio.getY());
        calcWFio.readResTxt("textRes.txt");
        System.out.println("y =  " + calcWFio.getY());
    }
}
