import java.time.LocalDate;

public class AirVehicle extends Vehicle {
    private final int flightHours;

    public AirVehicle(String vin, String brand, Owner owner, int flightHours, LocalDate regDate) {
        super(vin, brand, owner, regDate);
        this.flightHours = flightHours;
    }

    @Override
    public void displayDetails() {
        printBaseInfo();
        System.out.println(" | Type: AIR | Flight Hours: " + flightHours + "h");
    }

    @Override
    public void serviceVehicle() {
        System.out.println("Service: he will fly like lightning\n");
    }
}