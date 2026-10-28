public class Car {
    private String carMake;
    private int manufactureYear;
    private double engineDis;

    public Car(String carMake, int manufactureYear, double engineDis) {
        this.carMake = carMake;
        this.manufactureYear = manufactureYear;
        this.engineDis = engineDis;
    }

    public String getCarMake() {
        return carMake;
    }

    public void print() {
        System.out.println("carMake='" + carMake + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", engineDis=" + engineDis);
    }
}
