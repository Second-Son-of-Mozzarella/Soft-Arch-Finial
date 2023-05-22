public class Main {
    public static void main(String[] args) {

        IO_Stratagy ioStratagy;


      ioStratagy = new IO_Console();


        UI ui = UI.getInstance(ioStratagy);
        Garage garage = Garage.getInstance(ui);

        int answer = 0;

        do{
            answer = ui.getMenu();
            switch (answer){
                case 1 -> {garage.addVehicle();}

                case 2 -> {garage.changeJetting();}

                case 3 -> {garage.runVehicle();}

                case 4 -> {garage.addFuel();}


            }
        }while(answer != 5);

    }

}