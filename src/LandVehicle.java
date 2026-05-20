import java.time.LocalDate;

public class LandVehicle extends Vehicle {
    private final int odometer;

    public LandVehicle(String vin, String brand, Owner owner, int odometer, LocalDate regDate) {
        super(vin, brand, owner, regDate);
        this.odometer = odometer;
    }

    @Override
    public void displayDetails() {
        printBaseInfo();
        System.out.println(" | Type: LAND  | Mileage: " + odometer + " km");
    }

    @Override
    public void serviceVehicle() {
        System.out.println("Service: Sir, this will work out, sir\n");
    }
}