public class Car {
    private double fuelEfficiency; // Miles per gallon
    private double fuelLevel; // Gallons in the fuel tank

    public Car(double efficiency) {
        fuelEfficiency = efficiency;
        fuelLevel = 0;
    }

    public void addGas(double gallons) {
        fuelLevel += gallons; //fuelLevel = fuelLevel + gallons.
    }

    public void drive(double miles) {
        // Calculate the amount of fuel consumed during the drive
        double fuelConsumed = miles / fuelEfficiency;
        
        // Check if there is enough fuel to complete the drive
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
        Car myHybrid = new Car(50); // Efficiency of 50 miles per gallon
        myHybrid.addGas(20); // Tank 20 gallons

        // Drive 100 miles
        myHybrid.drive(100);

        // Get gas remaining in the tank
        double gasLeft = myHybrid.getGasInTank();
        System.out.println("Gas remaining: " + gasLeft + " gallons");
    }
}
