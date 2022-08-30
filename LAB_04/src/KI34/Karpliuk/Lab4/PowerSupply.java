package KI34.Karpliuk.Lab4;
/**
 * Class <code>PowerSupply</code> implements power supply
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class PowerSupply {
    // PowerSupply mode
    private boolean isTurnedOn;
    // PowerSupply power value
    private int powerValue;

    /**
     * Constructor
     */
    public PowerSupply() {
        isTurnedOn = false;
    }

    /**
     * Constructor
     * @param
     * <code>pValue</code> PowerSupply power value
     */
    public PowerSupply(int pValue) {
        powerValue = pValue;
    }

    /**
     * Method simulates PowerSupply turning on
     */
    public void turnOn(){
        isTurnedOn=true;
    }

    /**
     * Method simulates PowerSupply turning off
     */
    public void turnOff(){
        isTurnedOn=false;
    }

    /**
     * Method returns power supply power value
     * @return The PowerSupply power value
     */
    public int getPowerValue() {
        return powerValue;
    }
    /**
     * Method returns power supply mode
     * @return The PowerSupply mode
     */
    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}
