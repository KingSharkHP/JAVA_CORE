package PR1.Tutorial06;
public class Car {
    private double fuelEfficiency;
    private double fuelLevel;

    public Car(double efficiency) {
        fuelEfficiency = efficiency;
        fuelLevel = 0;
    }

    public void addGas(double gallons) {
        fuelLevel += gallons;
    }

    public void drive(double miles) {
        double fuelConsumed = miles / fuelEfficiency;
        if (fuelConsumed <= fuelLevel) {
            fuelLevel -= fuelConsumed;
        } else {
            System.out.println("Out of fuel! Can't complete the drive.");
        }
    }

    public double getGasInTank() {
        return fuelLevel;
    }

    public static void main(String[] args) {
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);

        myHybrid.drive(100);
        System.out.println("Gas remaining: " + myHybrid.getGasInTank() + " gallons");
    }
}
