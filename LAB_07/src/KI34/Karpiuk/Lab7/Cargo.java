package KI34.Karpiuk.Lab7;
/**
 * Class <code>Cargo</code> implements ships hold cargo
 *
 * @author Yurii Karpliuk
 * @version 1.0
 */

public class Cargo implements Data{
    // cargo weight value
    private int weight;
    // cargo name value;
    private String name;

    /**
     * Constructor
     *
     * @param
     * <code>cWeight</code> cargo weight value
     * @param
     * <code>cName</code> cargo name value
     */
    public Cargo(int cWeight, String cName) {
        weight = cWeight;
        name = cName;
    }

    /**
     * Method prints info about cargo
     */
    @Override
    public void print() {
        System.out.println("Cargo: " + name + "\nWeight: " + weight +"\n");
    }

    /**
     * Method returns cargo weight value
     *
     * @return Cargo weight value
     */
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Method returns cargo name value
     *
     * @return Cargo name value
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Data c) {
        Integer w = weight;
        return w.compareTo(c.getWeight());
    }
}
