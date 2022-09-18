package KI34.Karpiuk.Lab7;

import java.util.ArrayList;
/**
 * Class <code>ShipsHold</code> implements shipsHold
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class ShipsHold<T extends Data >{

    private boolean isOpened=false;
    private ArrayList<T> arr;
    public ShipsHold()
    {
        arr = new ArrayList<T>();
    }

    /**
     * Method returns max size value of element from arrray
     *
     * @return max element size value
     */
    public T findMax()
    {
        if (!arr.isEmpty())
        {
            T max = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(max) > 0 )
                    max = arr.get(i);

            }
            return max;
        }
        return null;
    }

    /**
     * Method simulates openning hold
     */
    public void openHold() {
        isOpened=true;
        System.out.println("Ship hold opened successfully!");
    }

    /**
     * Method simulates closing hold
     */
    public void closeHold(){
        isOpened=false;
        System.out.println("Ship hold closed successfully!");
    }
    /**
     * Method adds new element to array
     */
    public void addData(T data)
    {
        if(isOpened==true) {
            arr.add(data);
            System.out.print("Element added: ");
            data.print();
        }else{
            System.out.println("Please open hold to add new item");
        }
    }
    /**
     * Method deletes  element from array with i index
     */
    public void deleteData(int i)
    {
        if(isOpened==true) {
            arr.remove(i);
        }else{
            System.out.println("Please open hold to add new item");
        }
    }
}
