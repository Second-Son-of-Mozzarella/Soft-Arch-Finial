public class VehicleFactory {

    public static Vehicle getVehicle(String name, VehicleType type){
        return new Vehicle(name,new Engine(100), type);
    }
}
