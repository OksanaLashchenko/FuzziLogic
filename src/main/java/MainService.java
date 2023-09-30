import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainService {

    public static double FI_MAX = Math.toRadians(180);
    public static double FI_MIN = Math.toRadians(-180);
    public static double OMEGA_MAX = Math.toRadians(10);
    public static double OMEGA_MIN = Math.toRadians(-10);
    public static double MU_MAX = Math.toRadians(5);
    public static double MU_MIN = Math.toRadians(-5);
    public static double DELTA_MU = 0.1;
    public static double DELTA_T = 0.01;
    public static double T = 50.0;

    private double fi;
    private double omega;
    private double t;
    double mu_wave;
    double s1;
    double s2;

    public MainService(double fi, double omega, double t, double mu_wave, double s1, double s2) {
        this.fi = fi;
        this.omega = omega;
        this.t = t;
        this.mu_wave = mu_wave;
        this.s1 = s1;
        this.s2 = s2;
    }

    void getResult() throws IOException {
        List<DataObject> dataObjectList = new ArrayList<>();
        while (t < (T - 0.5 * DELTA_T)) {
            while (mu_wave < (100 - 0.5 * DELTA_MU)) {
                double fi_wave = (200 / (FI_MAX - FI_MIN)) * (fi - FI_MIN) - 100;
                double omega_wave = (200 / (OMEGA_MAX - OMEGA_MIN)) * (omega - OMEGA_MIN) - 100;
                DefaultFuzzyLogicService fuzzyLogicService = new DefaultFuzzyLogicService();
                double hi_star = fuzzyLogicService.getMembershipFunction(fi_wave, omega_wave, mu_wave);
                s1 = s1 + mu_wave * hi_star * DELTA_MU;
                s2 = s2 + hi_star * DELTA_MU;
                mu_wave = mu_wave + DELTA_MU;
            }
            double muWaveStar = s1 / s2;
            double mu = ((muWaveStar + 100) / 200) * (MU_MAX - MU_MIN) + MU_MIN;
            fi = fi + omega * DELTA_T;
            omega = omega + mu * DELTA_T;
            if (omega > Math.toRadians(180)) {
                omega = omega - 2 * Math.toRadians(180);
            }
            if (omega < Math.toRadians(-180)) {
                omega = omega + 2 * Math.toRadians(180);
            }
            t = t + DELTA_T;
            DataObject dataObject = new DataObject(t, fi, omega, mu);
            dataObjectList.add(dataObject);
            mu_wave = -100;
            s1 = 0;
            s2 = 0;
        }
        FileService fileService = new FileService();
        fileService.saveToScv(dataObjectList);
    }

}
