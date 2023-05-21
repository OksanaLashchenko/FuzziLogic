public class FunctionService {

    public double calculateFunction(double x, double a, double b, double c, double d) {
        if (x <= a) {
            return 0.0;
        } else if (x <= b) {
            return (x - a) / (b - a);
        } else if (x <= c) {
            return  1;
        } else if (x <= d) {
            return  (d - x) / (d - c);
        } else {
            return 0.0;
        }
    }

    public double calculateFunction1(double x) {
        return calculateFunction(x, -1000.0, -200.0, -100.0, -50.0);
    }

    public double calculateFunction2(double x) {
        return calculateFunction(x, -100.0, -50.0, -50.0, -10.0);
    }

    public double calculateFunction3(double x) {
        return calculateFunction(x, -50.0, -10.0, 0.0, 0.0);
    }

    public double calculateFunction4(double x) {
        return calculateFunction(x, 0.0, 0.0, 10.0, 50.0);
    }

    public double calculateFunction5(double x) {
        return calculateFunction(x, 10.0, 50.0, 50.0, 100.0);
    }

    public double calculateFunction6(double x) {
        return calculateFunction(x, 50.0, 100.0, 200.0, 1000.0);
    }

}
