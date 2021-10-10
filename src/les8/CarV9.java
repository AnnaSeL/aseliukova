package les8;

public class CarV9 {
    String location;

    public CarV9(String location) {
    }

    public void resetTrip() {
    }

    public void fillFullTank(double v) {
        System.out.println("Fill full trunk");
    }

    public void drive(int distance, String destination) {
        System.out.printf("Go %s km per %s\n", distance, destination);
    }

    public void fillTank(double liters, double price) {
        System.out.printf("Fill %s liters for %s grn.\n", liters, price);
    }

    public void printTripReport() {
    }
}
