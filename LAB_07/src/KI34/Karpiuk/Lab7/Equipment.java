package KI34.Karpiuk.Lab7;
/**
 * Class <code>Equipment</code> implements ships hold equipment
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */
public class Equipment implements Data {
    private int weight;
    private String name;
    private String appointment;

    /**
     * Constructor
     *
     * @param
     * <code>eWeight</code> equipment weigth value
     * <code>eName</code> equipment name value
     * <code>eAppointment</code> equipment appointment value
     */
    public Equipment(int eWeight, String eName, String eAppointment) {
        weight = eWeight;
        name = eName;
        appointment = eAppointment;
    }

    /**
     * Method prints info about cargo
     */
    @Override
    public void print() {
        System.out.println("Equipment: " + name + "\nWeight: " + weight + "\nAppointment: " + appointment + "\n");
    }

    /**
     * Method returns equipment weight value
     *
     * @return Equipment weight value
     */
    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Method returns equipment name value
     *
     * @return Equipment name value
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    @Override
    public int compareTo(Data e) {
        Integer w = weight;
        return w.compareTo(e.getWeight());
    }
}
