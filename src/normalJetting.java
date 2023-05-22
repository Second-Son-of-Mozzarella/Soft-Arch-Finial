public class normalJetting implements JettingStratagy{

    private double primaryJet;

    private double starterJet;

    public normalJetting(double primaryJet, double starterJet) {
        this.primaryJet = primaryJet;
        this.starterJet = starterJet;
    }

    @Override
    public long run(long fuel) {
        if((fuel - starterJet) > 0) {

            return Math.round(fuel * (0.5 - primaryJet));

        }

        return 0;
    }
}
