import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleRegistry registry = new VehicleRegistry();

        while (true) {
            System.out.println("\n      VEHICLE REGISTRY");
            System.out.println("    1. Add Land | 2. Add Air | 3. Add Water | 4. List All | 5. Service All | 0. Exit");
            System.out.print("  Select: ");

            String cmd = sc.nextLine();
            if (cmd.equals("0")) break;

            try {
                if (cmd.equals("1") || cmd.equals("2") || cmd.equals("3")) {
                    System.out.print("  First Name: ");
                    String fn = sc.nextLine();
                    System.out.print("  Last Name: ");
                    String ln = sc.nextLine();
                    Owner owner = new Owner(fn, ln);
                    String vin = "";
                    short counter = 0;
                    do{
                        if(counter > 0){
                            System.out.println("    VIN must have 17 characters!");
                        }
                        System.out.print("  VIN: ");
                        vin = sc.nextLine();
                        counter++;
                    }while(vin.length() != 17);

                    System.out.print("  Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("  Registration date (Year-Month-Day) [enter for today]: ");
                    String dateInput = sc.nextLine();
                    LocalDate regDate;
                    if (dateInput.isEmpty()) {
                        regDate = LocalDate.now();
                    } else {
                        regDate = LocalDate.parse(dateInput);
                    }

                    switch (cmd) {
                        case "1":
                            System.out.print("  Mileage: ");
                            int km = Integer.parseInt(sc.nextLine());
                            registry.register(new LandVehicle(vin, brand, owner, km, regDate));
                            break;
                        case "2":
                            System.out.print("  Flight Hours: ");
                            int hrs = Integer.parseInt(sc.nextLine());
                            registry.register(new AirVehicle(vin, brand, owner, hrs, regDate));
                            break;
                        case "3":
                            System.out.print("  Displacement (t): ");
                            double disp = Double.parseDouble(sc.nextLine());
                            System.out.print("  Submersible (y/n): ");
                            boolean sub = sc.nextLine().toLowerCase().startsWith("y");
                            registry.register(new WaterVehicle(vin, brand, owner, disp, sub, regDate));
                            break;
                    }
                    System.out.println("    Successfully added.");
                } else if (cmd.equals("4")) {
                    registry.listAll();
                } else if (cmd.equals("5")) {
                    registry.processMaintenance();
                }
            } catch (Exception e) {
                System.out.println("    Input Error: Ensure that numeric values are correct.");
            }
        }
        sc.close();
    }
}