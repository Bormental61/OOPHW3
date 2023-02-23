public class Land extends Transport{

    private String travelType;
    private boolean regular;


    public Land(int passNum, String type, String speed, String TraType, boolean regular) {
        super(passNum, type, speed);
        this.travelType = TraType;
        this.regular = regular;
    }

    @Override
    public String getTravelType() {
        return travelType;
    }

    @Override
    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    @Override
    public String toString() {
        return "Land{" +
                "travelType='" + travelType + '\'' +
                ", regular=" + regular +
                '}';
    }
}
