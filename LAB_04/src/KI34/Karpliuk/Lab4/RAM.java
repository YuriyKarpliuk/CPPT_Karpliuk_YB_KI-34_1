package KI34.Karpliuk.Lab4;
/**
 * Class <code>RAM</code> implements random-access memory
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class RAM {
    // RAM size value
    private int size;

    // RAM name value
    private String name;

    /**
     * Constructor
     *
     * @param
     * <code>psSize</code> RAM size value
     * @param
     * <code>pName</code>  RAM name value
     */
    public RAM(int psSize, String pName) {
        size = psSize;
        name = pName;
    }

    /**
     * Constructor
     */
    public RAM() {
        size = 8;
        name="Kingston DDR4";
    }

    /**
     * Method returns the RAM size value
     *
     * @return The RAM size value
     */
    public int getSize() {
        return size;
    }

    /**
     * Method returns the RAM name value
     *
     * @return The RAM name value
     */
    public String getName() {
        return name;
    }

    /**
     * Method simulates RAM increasing size value
     */
    public void increaseRAMSize(int increaseValue) {
        size += increaseValue;
    }

}
