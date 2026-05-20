public class VehicleRegistry {
    private Vehicle[] storage;
    private int size;

    public VehicleRegistry() {
        this.storage = new Vehicle[2];
        this.size = 0;
    }

    public void register(Vehicle v) {
        if (size == storage.length) {
            expandCapacity();
        }
        storage[size++] = v;
    }

    private void expandCapacity() {
        Vehicle[] newStorage = new Vehicle[storage.length * 2];
        System.arraycopy(storage, 0, newStorage, 0, storage.length);
        this.storage = newStorage;
    }

    public void listAll() {
        if (size == 0) {
            System.out.println("Registry is empty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            storage[i].displayDetails();
        }
    }

    public void processMaintenance() {
        for (int i = 0; i < size; i++) {
            storage[i].serviceVehicle();
        }
    }
}