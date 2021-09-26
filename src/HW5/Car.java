package HW5;

public class Car {
    int tankVolume ;
    double remainder;
    double consumption; //for 100 km
    double necessaryVolume;
    double price;
    double totalPrice = 0.0;
    double amountOfFuel;

    public double measureRemainder(double consumption, double kilometers){
        this.consumption = consumption;
        double forOneKm = (double) Math.round(consumption/100 * 100)/100;
        double wasted = (double) Math.round(forOneKm * kilometers*100)/100;
        if(wasted > tankVolume){
            System.out.println("Probably, you entered wrong numbers. You couldn't wasted more than volume of the tank!");
        }
        remainder = (double) Math.round((amountOfFuel - wasted)*100)/100;
        amountOfFuel = remainder;
        if(remainder <= 0){
            System.out.println("There is no fuel in the tank!");
        }else{
            System.out.printf("%.2f liters left.", remainder);
        }
        return remainder;
    }

    public double refuelling(int tankVolume){
        this.tankVolume = tankVolume;
        necessaryVolume = tankVolume - remainder;
        System.out.printf("\nYou should refuel %.2f liters.", necessaryVolume);
        return necessaryVolume;
    }

    private double maxToFill(){
        return ((double) Math.round((tankVolume - remainder)*100)/100);
    }

    public double fill(int tankVolume, double liters, double price) throws InterruptedException {
        this.tankVolume = tankVolume;
        this.price = price;
        if(liters <= maxToFill()){
            amountOfFuel += liters;
            double newPrice = (double) Math.round(liters*price*100)/100;
            totalPrice += newPrice;
            System.out.printf("\nYou want to fill %.2f liters. It costs %.2f grn.",liters, newPrice);
            System.out.println("\nRefuelling...");
            Thread.sleep(2000);
            System.out.printf("Now amount of fuel is %.2f liters\n", amountOfFuel);
            return amountOfFuel;
        }else{
            System.out.println("You entered wrong amount.");
            return 0;
        }
    }

    public void printTotalPrice(){
        System.out.printf("\nTotal price is %.2f grn.", totalPrice);
    }

}
