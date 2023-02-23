public class Auto extends Land {
    private String size;
    private String fuel;

    public Auto(int passNum, String type, String speed, String type2, boolean regular, String size, String fuel) {
        super(passNum, type, speed, type2, regular);
        this.fuel = fuel;
        this.size = size;
    }

    @Override
    public String getTravelType() {
        return size;
    }

    @Override
    public void setTravelType(String travelType) {
        this.size = travelType;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "size='" + size + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
