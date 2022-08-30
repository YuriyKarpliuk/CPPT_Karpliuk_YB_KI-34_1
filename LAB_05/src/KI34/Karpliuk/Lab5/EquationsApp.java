package KI34.Karpliuk.Lab5;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class EquationsApp{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        try
        {
            Scanner in = new Scanner(System.in);
            PrintWriter fout = new PrintWriter(new File("Output.txt"));
            try
            {
                try
                {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                }
                finally
                {
// Цей блок виконається за будь-яких обставин
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException ex)
            {
// Блок перехоплює помилки обчислень виразу
                out.print(ex.getMessage());
            }
        }
        catch (FileNotFoundException ex)
        {
// Блок перехоплює помилки роботи з файлом навіть якщо вони
// виникли у блоці finally
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author Yurii Karpliuk
 * @version 1.0
 */
class CalcException extends ArithmeticException
{
    public CalcException(){}

    public CalcException(String message)
    {
        super(message);
    }
}
/**
 * Class <code>Equations</code> implements method for (ctg(x)/ sin(7x-1)) expression
 * calculation
 * @author  Yurii Karpliuk
 * @version 1.0
 */
class Equations
{
    /**
     * Method calculates the (ctg(x)/ sin(7x-1)) expression
     * @param
     * <code>x</code> Angle in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException
    {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try
        {
            y = (Math.tan(rad));
// Якщо результат не є числом, то генеруємо виключення
            if (y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || x % 180==0) {

                throw new ArithmeticException();
            }

        }
        catch (ArithmeticException ex)
        {
// створимо виключення вищого рівня з поясненням причини
// виникнення помилки
            if (rad==Math.PI || rad==-Math.PI || rad % Math.PI==0)
                throw new CalcException("Exception reason: Illegal value of X for cotangent calculation");
        else
            throw new CalcException("Unknown reason of the exception during exception calculation");

        }
        return y;
    }
}