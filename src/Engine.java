public class Engine {

    private long fuel = 100;

    private JettingStratagy jettingStratagy;

    public Engine(int fuel) {
        this.fuel = fuel;
    }

    public void addFuel(long addedFuel){
        fuel += addedFuel;
    }

    public long getFuel() {
        return fuel;
    }

    public void run(){

        if(jettingStratagy != null){
            fuel =  jettingStratagy.run(fuel);
        }
    }

    public void setJettingStratagy(JettingStratagy jettingStratagy){
        this.jettingStratagy = jettingStratagy;
    }



}
