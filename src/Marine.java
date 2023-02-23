public class Marine extends Transport{
    private String name;
    private String portOfResidence;
    private int milesPerYear;


    public Marine(int passNum, String type, String speed, String name, String port, int miles) {
        super(passNum, type, speed);
        this.name = name;
        this.portOfResidence = port;
        this.milesPerYear = miles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortOfResidence() {
        return portOfResidence;
    }

    public void setPortOfResidence(String portOfResidence) {
        this.portOfResidence = portOfResidence;
    }

    public int getMilesPerYear() {
        return milesPerYear;
    }

    public void setMilesPerYear(int milesPerYear) {
        this.milesPerYear = milesPerYear;
    }

    @Override
    public String toString() {
        return "Marine{" +
                "name='" + name + '\'' +
                ", portOfResidence='" + portOfResidence + '\'' +
                ", milesPerYear=" + milesPerYear +
                '}';
    }
}
