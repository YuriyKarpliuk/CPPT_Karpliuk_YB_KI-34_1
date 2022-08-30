package KI34.Karpliuk.Lab3;

public class OS {
    // OS type value
    private OSType osType;

    //OS working mode
    private boolean isStarted;

    /**
     * Constructor
     */
    public OS() {
        osType = OSType.WINDOWS;
        isStarted=false;
    }

    /**
     * Method simulates OS start's working
     */
    public void startOS(){
        isStarted=true;
    }

    /**
     * Method simulates OS finishes working
     */
    public void finishOS(){
        isStarted=false;
    }

    /**
     * Method returns OS type value
     * @return OS type value of
     * <code>OS.OSType</code>
     */
    public OSType getOsType(){
        return osType;
    }

    /**
     * Method simulates OS changing
     */
    public void changeOS(OSType osTypeValue){
        osType=osTypeValue;
    }

    /**
     * Method returns OS  mode
     * @return The OS mode
     */
    public boolean isStarted() {
        return isStarted;
    }
}
