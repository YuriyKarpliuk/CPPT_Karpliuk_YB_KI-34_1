package KI34.Karpliuk.Lab3;

import java.io.FileNotFoundException;

/**
 * Computer Application class implements main method for Computer
 * class possibilities demonstration
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class ComputerApplication {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Computer computer = new Computer(850);
        computer.switchOn();
        System.out.println("RAM size: "+ computer.getRAMSize()+" GB");
        System.out.println("RAM name: "+computer.getRAMName());
        System.out.println("Processor cores value: "+computer.getProcessorCoresValue());
        System.out.println("Processor name: "+computer.getProcessorNameValue());
        System.out.println("Power Supply value: "+computer.getPowerSupplyPowerValue()+" W");
        System.out.println("Processor usage percentage: "+computer.getProcessorUsagePercentage()+ "%");
        System.out.println("Operating System name: "+computer.getOSTypeName());
        computer.changeOSType(OSType.LINUX);
        computer.switchOff();
        computer.increaseRAM(8);
        computer.dispose();
    }
}
