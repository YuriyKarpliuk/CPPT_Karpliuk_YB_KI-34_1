package KI34.Karpliuk.Lab4;

import java.io.FileNotFoundException;

/**
 * Laptop Application class implements main method for Laptop
 * class possibilities demonstration
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class LaptopApplication {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Laptop laptop = new Laptop(850);
        laptop.switchOn();
        System.out.println("RAM size: "+ laptop.getRAMSize()+" GB");
        System.out.println("RAM name: "+laptop.getRAMName());
        System.out.println("Processor cores value: "+laptop.getProcessorCoresValue());
        System.out.println("Processor name: "+laptop.getProcessorNameValue());
        System.out.println("Power Supply value: "+laptop.getPowerSupplyPowerValue()+" W");
        System.out.println("Processor usage percentage: "+laptop.getProcessorUsagePercentage()+ "%");
        System.out.println("Operating System name: "+laptop.getOSTypeName());
        laptop.changeOSType(OSType.LINUX);
        laptop.charge();
        laptop.moveCursor(22,5);
        laptop.displayOnScreen("Application starts running!");
        laptop.switchOff();
        laptop.increaseRAM(8);
        laptop.dispose();
    }
}
