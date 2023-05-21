public class DataObject {

    private final double t;
    private final double fi;
    private final double omega;
    private final double mu;

    public DataObject(double t, double fi, double omega, double mu) {
        this.t = t;
        this.fi = fi;
        this.omega = omega;
        this.mu = mu;
    }

    public double getT() {
        return t;
    }

    public double getFi() {
        return fi;
    }

    public double getOmega() {
        return omega;
    }

    public double getMu() {
        return mu;
    }

}
