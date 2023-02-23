public class Avia extends Transport{

    private String name;
    private boolean international;
    private int flightsPerMonth;

    public Avia(int passNum, String speed, String name, boolean international, int flights) {
        super(passNum, speed);
        this.name = name;
        this.international = international;
        this.flightsPerMonth = flights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public int getFlightsPerMonth() {
        return flightsPerMonth;
    }

    public void setFlightsPerMonth(int fligthsPerMonth) {
        this.flightsPerMonth = fligthsPerMonth;
    }

    @Override
    public String toString() {
        return "Avia{" +
                "name='" + name + '\'' +
                ", international=" + international +
                ", flightsPerMonth=" + flightsPerMonth +
                '}';
    }
}
