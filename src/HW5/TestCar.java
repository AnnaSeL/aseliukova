package HW5;

public class TestCar {
    public static void main(String[] args) throws InterruptedException {
        Car jeep = new Car();

        System.out.println();

        System.out.print("You are in Odessa. Are you re for the trip?");
        jeep.refuelling(60);
        jeep.fill(60, 60.0, 29.7);

        System.out.println();

        System.out.println("First stop 'Кривое озеро'");
        jeep.measureRemainder(11.6, 181);
        jeep.refuelling(60);
        jeep.fill(60, 10, 29.7);

        System.out.println();

        System.out.println("Second stop 'Жашков'");
        jeep.measureRemainder(11.6, 154);
        jeep.refuelling(60);
        jeep.fill(60, jeep.necessaryVolume, 30);

        System.out.println();

        System.out.println("You arrived in Kiev.");
        jeep.measureRemainder(11.6, 146);
        jeep.printTotalPrice();
    }
}
