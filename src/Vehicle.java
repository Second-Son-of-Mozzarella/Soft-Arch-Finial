import java.security.PrivateKey;

public class Vehicle {

    private String name;

    private Engine engine;

    private VehicleType vehicleType;

    public Vehicle(String name, Engine engine, VehicleType vehicleType) {
        this.name = name;
        this.engine = engine;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void addFuel(int fillUp){
        engine.addFuel(fillUp);
    }

    public void setJetting(String choice){
        switch (choice){

            case "1":
                engine.setJettingStratagy(new FatJetting(0.165, 0.65)); // these are the jettings I usally run on my bike
                break;
            case "2":
                engine.setJettingStratagy(new normalJetting(0.155, 0.55));
                break;
            case "3":
                engine.setJettingStratagy(new leanJetting(0.145, 0.45));
                break;

            default:
                engine.setJettingStratagy(new normalJetting(0.155, 0.55));
                break;

        }
    }
    public void runVehicle(int Mileage){
        for(int miles = 0; miles < Mileage; miles++){
            if(engine.getFuel() <= 1){break;}
            engine.run();
            System.out.println("Miles traveled" + miles + ", fuel" + engine.getFuel());
        }
    }
}
