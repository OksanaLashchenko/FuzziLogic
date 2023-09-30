public class DefaultFuzzyLogicService implements FuzzyLogicService {

    public static final int CHISLO_PRAVIL = 36;

    @Override
    public double getMembershipFunction(double fiWave, double omegaWave, double muWave) {
        double hiStar = 0;
        int n = 1;

        while (n <= CHISLO_PRAVIL) {
            RuleLibrary2 ruleLibrary = new RuleLibrary2();
            double hi = ruleLibrary.getHi(n, fiWave, omegaWave, muWave);
               if (hiStar < hi) {
                hiStar = hi;
            }
            n++;
        }
        return hiStar;
    }

}
