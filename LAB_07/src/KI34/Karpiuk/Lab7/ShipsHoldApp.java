package KI34.Karpiuk.Lab7;

import java.io.FileNotFoundException;

/**
 * ShipsHoldApp class implements main method for ShipsHold
 * class possibilities demonstration
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class ShipsHoldApp{
    /**
     * @param args
     */
    public static void main(String[] args) {
        ShipsHold<? super Data> shipsHold = new ShipsHold<Data>();
        shipsHold.openHold();
        shipsHold.addData(new Cargo(200,"Fish"));
        shipsHold.addData(new Cargo(2500,"Car"));
        shipsHold.addData(new Equipment(100,"Bucket of sand","to stop the fire"));
        shipsHold.addData(new Equipment(200,"Boat","to rescue from drowning"));
        shipsHold.closeHold();
        Data res = shipsHold.findMax();
        System.out.print("The greatest data on shipsHold is: \n");
        res.print();
        shipsHold.deleteData(0);
    }

}
