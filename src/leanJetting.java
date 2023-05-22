public class leanJetting implements JettingStratagy{

    private double primaryJet;

    private double starterJet;

    public leanJetting(double primaryJet, double starterJet) {
        this.primaryJet = primaryJet;
        this.starterJet = starterJet;
    }

    @Override
    public long run(long fuel) {
        if((fuel - starterJet) > 0) {

            return Math.round(fuel * primaryJet);

        }

        return 0;
    }
}
