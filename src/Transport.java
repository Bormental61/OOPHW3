public class Transport {
    private int passNum;
    private String type;
    private String speed;

    public Transport(int passNum, String type, String speed) {
        this.passNum = passNum;
        this.type = type;
        this.speed = speed;
    }

    public Transport(int passNum, String speed) {
        this.passNum = passNum;
        this.speed = speed;
    }

    public int getPassNum() {
        return passNum;
    }

    public String getTravelType() {
        return type;
    }

    public String getSpeed() {
        return speed;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }

    public void setTravelType(String travelType) {
        this.type = travelType;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Transport {" +
                "Пассажировместимость = " + passNum +
                ", тип транспорта = '" + type + '\'' +
                ", скорость = '" + speed + '\'' +
                '}';
    }
}
