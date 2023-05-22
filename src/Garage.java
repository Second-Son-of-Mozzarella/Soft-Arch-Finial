import java.util.ArrayList;
import java.util.List;

public class Garage {

    private static Garage garage;
    private List<Vehicle> ownedVehicles;

    private UI ui;

    private Garage(UI ui){
        this.ownedVehicles = new ArrayList<>();
        this.ui = ui;
    }

    public static Garage getInstance(UI ui){
        if(garage == null){
            garage = new Garage(ui);
        }
        return garage;
    }

    public List<Vehicle> getGarage() {return ownedVehicles;}

    public void addVehicle(){
        String name = ui.getName();
        VehicleType vehicleTypeChoice = ui.getVehicleType();
        ownedVehicles.add(VehicleFactory.getVehicle(name, vehicleTypeChoice));
    }

    public void changeJetting(){
        int answer = ui.getVehicleSelection(ownedVehicles);
        ownedVehicles.get(answer).setJetting(ui.getStrat());
    }


    public void runVehicle(){
        int answer = ui.getVehicleSelection(ownedVehicles);
        ownedVehicles.get(answer).runVehicle(ui.mileageQuestion());
    }

    public void addFuel(){
        int answer = ui.getVehicleSelection(ownedVehicles);
        ownedVehicles.get(answer).addFuel(ui.fuelQuestion());
    }

}
