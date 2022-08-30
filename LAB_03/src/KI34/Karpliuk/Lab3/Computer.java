package KI34.Karpliuk.Lab3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class <code>Computer</code> implements computer
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */

public class Computer {
    private PrintWriter fout;
    private RAM ram;
    private Processor processor;
    private PowerSupply powerSupply;

    private OS os;

    /**
     * Constructor
     *
     * @throws FileNotFoundException
     */
    public Computer() throws FileNotFoundException {
        ram = new RAM();
        powerSupply = new PowerSupply();
        processor = new Processor();
        os = new OS();
        fout = new PrintWriter("Log.txt");
    }

    /**
     * Constructor
     *
     * @param
     * <code>powerValue</code> PowerSupply power value
     * @throws FileNotFoundException
     */
    public Computer(int powerValue) throws FileNotFoundException {
        ram = new RAM();
        powerSupply = new PowerSupply(powerValue);
        processor = new Processor();
        os = new OS();
        fout = new PrintWriter("Log.txt");
    }

    /**
     * Method simulates switching on computer
     */
    public void switchOn() {
        powerSupply.turnOn();
        processor.startProcessorWorking();
        os.startOS();
        System.out.println("Computer is switched on!");
        fout.print("Computer is switched on!" + "\n");
        fout.print("Power supply is turned on! Status: " + powerSupply.isTurnedOn() + "\n");
        fout.print("Processor start's working : " + processor.getUsagePercentage() + "\n");
        fout.print("OS start's working! Status: " + os.isStarted() + "\n");
        fout.flush();
    }

    /**
     * Method simulates switching off computer
     */
    public void switchOff() {
        powerSupply.turnOff();
        processor.finishProcessorWorking();
        os.finishOS();
        System.out.println("Computer is switched off!");
        fout.print("Computer is switched off! " + "\n");
        fout.print("Power supply is turned off! Status: " + powerSupply.isTurnedOn() + "\n");
        fout.print("Processor finishes working : " + processor.getUsagePercentage() + "\n");
        fout.print("OS finishes working! Status:" + os.isStarted() + "\n");
        fout.flush();
    }

    /**
     * Method simulates RAM increasing size value
     */
    public void increaseRAM(int increaseValue) {
        fout.print("RAM size before increasing : " + ram.getSize() + "\n");
        ram.increaseRAMSize(increaseValue);
        fout.print("RAM size after increasing : " + ram.getSize() + "\n");
    }

    /**
     * Method returns info about RAM size value
     *
     * @return RAM size value
     */
    public int getRAMSize() {
        return ram.getSize();
    }

    /**
     * Method returns info about RAM name value
     *
     * @return RAM name value
     */
    public String getRAMName() {
        return ram.getName();
    }

    /**
     * Method returns info about Processor usage percentage
     *
     * @return Processor usage percentage
     */
    public int getProcessorUsagePercentage() {
        return processor.getUsagePercentage();
    }

    /**
     * Method returns info about Processor name value
     *
     * @return Processor name value
     */
    public String getProcessorNameValue() {
        return processor.getNameOfProcessor();
    }

    /**
     * Method returns info about Processor cores value
     *
     * @return Processor cores value
     */
    public int getProcessorCoresValue() {
        return processor.getAmountOfCores();
    }


    /**
     * Method returns info about PowerSupply power value
     *
     * @return PowerSupply power value
     */
    public int getPowerSupplyPowerValue() {
        return powerSupply.getPowerValue();
    }

    /**
     * Method returns info about OS type name
     *
     * @return OS type name
     */
    public String getOSTypeName() {
        return os.getOsType().name();
    }

    /**
     * Method simulates OS type changing
     */
    public void changeOSType(OSType osTypeValue){
        os.changeOS(osTypeValue);
        fout.print("OS type changed to : " + os.getOsType().name() + "\n");
        fout.flush();
    }

    /**
     * Method releases used recourses
     */
    public void dispose() {
        fout.close();
    }


}
