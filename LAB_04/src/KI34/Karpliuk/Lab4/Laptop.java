package KI34.Karpliuk.Lab4;

import java.io.FileNotFoundException;

/**
 * Class <code>Laptop</code> extends class Computer
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
// оголошуємо клас, що реалізує інтерфейси Chargeable,Cursor,Displayable та наслідується від абстрактного класу Computer
public class Laptop extends Computer implements Chargeable,Cursor,Displayable{
    // Laptop battery capacity value
    private int batteryCapacity;

    /**
     * Constructor
     *
     * @param
     * <code>powerValue</code> PowerSupply power value
     * @throws FileNotFoundException
     */
    public Laptop(int powerValue) throws FileNotFoundException {
        super(powerValue);
        batteryCapacity=(int) ((Math.random() * (100 - 1)) + 1);
    }

    /**
     * Method simulates switching on laptop
     */
    @Override
    public void switchOn() {
        super.getPowerSupply().turnOn();
        super.getProcessor().startProcessorWorking();
        super.getOs().startOS();
        System.out.println("Laptop is switched on!");
        super.getFout().print("Laptop is switched on!" + "\n");
        super.getFout().print("Power supply is turned on! Status: " + super.getPowerSupply().isTurnedOn() + "\n");
        super.getFout().print("Processor start's working : " + super.getProcessor().getUsagePercentage() + "\n");
        super.getFout().print("OS start's working! Status: " + super.getOs().isStarted() + "\n");
        super.getFout().flush();
    }
    /**
     * Method simulates switching off laptop
     */
    @Override
    public void switchOff() {
        super.getPowerSupply().turnOff();
        super.getProcessor().finishProcessorWorking();
        super.getOs().finishOS();
        System.out.println("Laptop is switched off!");
        super.getFout().print("Laptop is switched off! " + "\n");
        super.getFout().print("Power supply is turned off! Status: " + super.getPowerSupply().isTurnedOn() + "\n");
        super.getFout().print("Processor finishes working : " + super.getProcessor().getUsagePercentage() + "\n");
        super.getFout().print("OS finishes working! Status:" + super.getOs().isStarted() + "\n");
        super.getFout().flush();
    }

    /**
     * Method simulates charging laptop
     */
    @Override
    public void charge() {
        batteryCapacity+=(int) ((Math.random() * (5 - 1)) + 1);
        System.out.println("Start charging battery! Capacity is:"+batteryCapacity);
    }
    /**
     * Method simulates moving cursor
     */
    @Override
    public void moveCursor(int x, int y) {
        System.out.println("Cursor moved to coordinate: ("+x+";"+y+")");
    }
    /**
     * Method simulates displaying content on the laptop screen
     */
    @Override
    public void displayOnScreen(String content) {
        System.out.println("Information displayed on screen successfully:"+"\n"+content);
    }
}
