package KI34.Karpliuk.Lab5;

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
class CalcException extends ArithmeticException {
    public CalcException(String message) {
        super(message);
    }
}
