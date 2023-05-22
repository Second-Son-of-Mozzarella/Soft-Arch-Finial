import java.lang.reflect.Member;
import java.util.List;

public class UI {


    private static UI ui;

    private IO_Stratagy ioStratagy;

    private UI(IO_Stratagy ioStratagy) {
        this.ioStratagy = ioStratagy;
    };

    public static UI getInstance(IO_Stratagy ioStratagy){
        if(ui == null){
            ui = new UI(ioStratagy);
        }

        return ui;
    }


    public int getMenu(){
        ioStratagy.outputLine("\n1. Add a vehicle \n2. Set vehicle jetting\n3. Run a vehicle \n4. add fuel \n5. Exit");
        try{
            int answer = Integer.parseInt(ioStratagy.inputCharacter()+"");
            return answer;
        }catch(Exception e){
            ioStratagy.outputLine("Invalid answer");
            return 5;
        }
    }

    public String getName() {
        ioStratagy.outputLine("Please enter vehicle name: ");
        return ioStratagy.inputString();
    }

    public VehicleType getVehicleType(){
        ioStratagy.outputLine("(S)hip or (T)ruck: ");
        switch (ioStratagy.inputCharacter()){
            case 'S' -> {return VehicleType.Ship;} // I got lazy doing redundency in inputs. I know I could cast as a String and use .toUpperCase
            case 's' -> {return VehicleType.Ship;}
            case 'T' -> {return VehicleType.Truck;}
            case 't' -> {return VehicleType.Ship;}
            default -> {return VehicleType.Ship;}
        }

    }

    public String getStrat() {
        ioStratagy.outputLine("Would you like to run you vehicle \n [1] normal \n [2] lean \n [3] fat ");
        return ioStratagy.inputString();
    }


    public void listVehicles(List<Vehicle> garage){
        for(int i=0; i<garage.size();i++){

                ioStratagy.outputLine(i + ". " + garage.get(i).getName());

        }
    }

    public int getVehicleSelection(List<Vehicle> garage){
        listVehicles(garage);
        return Character.getNumericValue(ioStratagy.inputCharacter());
    }

    public int mileageQuestion(){
        ioStratagy.outputLine("how far would you like to drive");
        return  Integer.parseInt(ioStratagy.inputString());
    }

    public int fuelQuestion(){
        ioStratagy.outputLine("How much fuel would you like add -> ");
        return  Integer.parseInt(ioStratagy.inputString());
    }

}
