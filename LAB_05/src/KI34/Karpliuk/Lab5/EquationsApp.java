package KI34.Karpliuk.Lab5;

import java.util.Scanner;
import java.io.*;


/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class EquationsApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            PrintWriter fout = new PrintWriter(new File("Output.txt"));
            try {
                try {
                    Equations eq = new Equations();
                    System.out.println("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                } finally {
// Цей блок виконається за будь-яких обставин
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {
// Блок перехоплює помилки обчислень виразу
                System.out.println(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
// Блок перехоплює помилки роботи з файлом навіть якщо вони
// виникли у блоці finally
            System.out.println("Exception reason: Perhaps wrong file path");
        }
    }
}
