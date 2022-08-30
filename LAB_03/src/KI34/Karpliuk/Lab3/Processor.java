package KI34.Karpliuk.Lab3;
/**
 * Class <code>Processor</code> implements processor
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class Processor {
    // Processor amount of cores value
    private int amountOfCores;
    // Processor name value
    private String nameOfProcessor;

    // Processor usage percentage value
    private int usagePercentage;

    /**
     * Constructor
     * @param
     * <code>pAmountOfCores</code> Processor amount of cores value
     * @param
     * <code>pNameOfProcessor</code> Processor name value
     */
    public Processor(int pAmountOfCores, String pNameOfProcessor) {
        amountOfCores = pAmountOfCores;
        nameOfProcessor = pNameOfProcessor;
        usagePercentage = 0;
    }

    /**
     * Constructor
     */
    public Processor() {
        nameOfProcessor = "Intel Core i5";
        amountOfCores = 6;
    }

    /**
     * Method returns the Processor amount of cores value
     * @return The Processor amount of cores value
     */
    public int getAmountOfCores() {
        return amountOfCores;
    }

    /**
     * Method returns the Processor name value
     * @return The Processor name value
     */
    public String getNameOfProcessor() {
        return nameOfProcessor;
    }

    /**
     * Method simulates Processor start working
     */
    public void startProcessorWorking(){
        usagePercentage= (int) ((Math.random() * (100 - 5)) + 5);
    }

    /**
     * Method simulates Processor finish working
     */
    public void finishProcessorWorking(){
        usagePercentage= 0;
    }

    /**
     * Method returns the Processor usage percentage value
     * @return The Processor usage percentage value
     */
    public int getUsagePercentage() {
        return usagePercentage;
    }
}
