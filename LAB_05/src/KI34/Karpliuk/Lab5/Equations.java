package KI34.Karpliuk.Lab5;

/**
 * Class <code>Equations</code> implements method for (ctg(x)/ sin(7x-1)) expression
 * calculation
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
class Equations {
    /**
     * Method calculates the (ctg(x)/ sin(7x-1)) expression
     *
     * @param <code>x</code> Angle in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, rad;
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
        return y;
    }
}