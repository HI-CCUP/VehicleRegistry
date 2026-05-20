import java.time.LocalDate;

public abstract class Vehicle {
    private final String vin;
    private final String brand;
    private final Owner owner;
    private final LocalDate registrationDate;

    public Vehicle(String vin, String brand, Owner owner, LocalDate registrationDate) {
        this.vin = vin;
        this.brand = brand;
        this.owner = owner;
        this.registrationDate = registrationDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    protected void printBaseInfo() {
        System.out.print(String.format("Data rej: %-10s | VIN: %-10s | Brand: %-10s | Owner: %s",
                registrationDate, vin, brand, owner));
    }

    public abstract void displayDetails();
    public abstract void serviceVehicle();
}