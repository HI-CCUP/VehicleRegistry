import java.time.LocalDate;

public class WaterVehicle extends Vehicle {
    private final double displacement;
    private final boolean submersible;

    public WaterVehicle(String vin, String brand, Owner owner, double displacement, boolean submersible, LocalDate regDate) {
        super(vin, brand, owner, regDate);
        this.displacement = displacement;
        this.submersible = submersible;
    }

    @Override
    public void displayDetails() {
        printBaseInfo();
        System.out.println(" | Type: WATER | Displacement: " + displacement + "t | Sub: " + (submersible ? "YES" : "NO"));
    }

    @Override
    public void serviceVehicle() {
        System.out.println("Service: Replacing the rear drive propeller (XDDDD)\n");
    }
}