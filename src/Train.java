public class Train extends Land {
    private int number;

    public Train(int passNum, String type, String speed, String type2, boolean regular, int number) {
        super(passNum, type, speed, type2, regular);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                '}';
    }
}
