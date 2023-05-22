public class FatJetting implements JettingStratagy{
    private double primaryJet;

    private double starterJet;

    public FatJetting(double primaryJet, double starterJet) {
        this.primaryJet = primaryJet;
        this.starterJet = starterJet;
    }

    @Override
    public long run(long fuel) {
        if((fuel - starterJet) > 0) {

            return Math.round(fuel * (1 - primaryJet));

        }

        return 0;
    }
}
