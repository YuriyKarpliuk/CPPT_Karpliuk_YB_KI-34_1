package KI34.Karpliuk.Lab6;


import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Class <code>CalcWFio</code> implements methods for calculate (ctg(x)/ sin(7x-1)) expression and write/read result from text/bin file
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
class CalcWFio {
    // result value of expression: y = (ctg(x)/ sin(7x-1))
    private double y;
    /**
     * Method writes y to text file
     *
     * @param <code>fName</code> File name
     * @throws FileNotFoundException
     */
    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.print(y);
        f.close();
    }

    /**
     * Method reads y from text file
     *
     * @param <code>fName</code> File name
     * @throws FileNotFoundException
     */
    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                s.useLocale(Locale.US);
                y = s.nextDouble();
                s.close();
            } else
                throw new FileNotFoundException("File " + fName + "not found");
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    /**
     * Method writes y to binary file
     *
     * @param <code>fName</code> File name
     * @throws IOException
     */
    public void writeResBin(String fName) throws IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(y);
        f.close();

    }

    /**
     * Method reads y from binary file
     *
     * @param <code>fName</code> File name
     * @throws IOException
     */
    public void readResBin(String fName) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        y = f.readDouble();
        f.close();
    }

    /**
     * Method calculates the (ctg(x)/ sin(7x-1)) expression
     *
     * @param
     * <code>x</code> Angle in degrees
     * @throws CalcException
     */
    public void calculate(int x) throws CalcException {
        double rad;
        rad = x * Math.PI / 180.0;
        try {
            y = ((1.0 / Math.tan(rad)) / Math.sin(7 * rad - 1));
// Якщо значення кута рівне PI(2K+1)/2 де K є цілим число,то вираз стає рівним 0, оскільки cot(PI(2K+1)/2)=0
            if ((rad % (Math.PI / 2)) % 1 == 0) {
                y = 0;
            }
// Якщо результат не є числом, то генеруємо виключення
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x % 180 == 0) {

                throw new ArithmeticException();
            }

        } catch (ArithmeticException ex) {
// створимо виключення вищого рівня з поясненням причини
// виникнення помилки
            if ((rad % Math.PI) % 1 == 0)
                throw new CalcException("Exception reason: Illegal value of X for cotangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");

        }
    }
    /**
     * Method returns y
     * @return  y value
     */
    public double getY() {
        return y;
    }

}
