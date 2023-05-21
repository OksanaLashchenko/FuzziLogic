public class RuleLibrary {

    public double getHi(int n, double fiWave, double omegaWave, double muWave) {
        double alfa = 0.0;
        double beta = 0.0;
        double gamma = 0.0;
        double delta = 0.0;
        double hi = 0.0;

        FunctionService functionService = new FunctionService();

        switch (n) {
            case 1:
//                int n1 = 1;
//                int n2 = 1;
//                int m = 6;
                alfa = functionService.calculateFunction1(fiWave);
                beta = functionService.calculateFunction1(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 2:
//                int n1 = 1;
//                int n2 = 2;
//                int m = 6;
                alfa = functionService.calculateFunction1(fiWave);
                beta = functionService.calculateFunction2(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 3:
//                int n1 = 1;
//                int n2 = 3;
//                int m = 6;
                alfa = functionService.calculateFunction1(fiWave);
                beta = functionService.calculateFunction3(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 4:
//                int n1 = 1;
//                int n2 = 4;
//                int m = 5;
                alfa = functionService.calculateFunction1(fiWave);
                beta = functionService.calculateFunction4(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 5:
//                int n1 = 1;
//                int n2 = 5;
//                int m = 5;
                alfa = functionService.calculateFunction1(fiWave);
                beta = functionService.calculateFunction5(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 6:
//                int n1 = 1;
//                int n2 = 6;
//                int m = 5;
                alfa = functionService.calculateFunction1(fiWave);
                beta = functionService.calculateFunction6(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 7:
//                int n1 = 2;
//                int n2 = 1;
//                int m = 6;
                alfa = functionService.calculateFunction2(fiWave);
                beta = functionService.calculateFunction1(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 8:
//                int n1 = 2;
//                int n2 = 2;
//                int m = 6;
                alfa = functionService.calculateFunction2(fiWave);
                beta = functionService.calculateFunction2(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 9:
//                int n1 = 2;
//                int n2 = 3;
//                int m = 6;
                alfa = functionService.calculateFunction2(fiWave);
                beta = functionService.calculateFunction3(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 10:
//                int n1 = 2;
//                int n2 = 4;
//                int m = 5;
                alfa = functionService.calculateFunction2(fiWave);
                beta = functionService.calculateFunction4(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 11:
//                int n1 = 2;
//                int n2 = 5;
//                int m = 5;
                alfa = functionService.calculateFunction2(fiWave);
                beta = functionService.calculateFunction5(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 12:
//                int n1 = 2;
//                int n2 = 6;
//                int m = 5;
                alfa = functionService.calculateFunction2(fiWave);
                beta = functionService.calculateFunction6(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 13:
//                int n1 = 3;
//                int n2 = 1;
//                int m = 6;
                alfa = functionService.calculateFunction3(fiWave);
                beta = functionService.calculateFunction1(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 14:
//                int n1 = 3;
//                int n2 = 2;
//                int m = 6;
                alfa = functionService.calculateFunction3(fiWave);
                beta = functionService.calculateFunction2(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 15:
//                int n1 = 3;
//                int n2 = 3;
//                int m = 6;
                alfa = functionService.calculateFunction3(fiWave);
                beta = functionService.calculateFunction3(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 16:
//                int n1 = 3;
//                int n2 = 4;
//                int m = 5;
                alfa = functionService.calculateFunction3(fiWave);
                beta = functionService.calculateFunction4(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 17:
//                int n1 = 3;
//                int n2 = 5;
//                int m = 5;
                alfa = functionService.calculateFunction3(fiWave);
                beta = functionService.calculateFunction5(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 18:
//                int n1 = 3;
//                int n2 = 6;
//                int m = 5;
                alfa = functionService.calculateFunction3(fiWave);
                beta = functionService.calculateFunction6(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 19:
//                int n1 = 4;
//                int n2 = 1;
//                int m = 6;
                alfa = functionService.calculateFunction4(fiWave);
                beta = functionService.calculateFunction1(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction6(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 20:
//                int n1 = 4;
//                int n2 = 2;
//                int m = 5;
                alfa = functionService.calculateFunction4(fiWave);
                beta = functionService.calculateFunction2(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 21:
//                int n1 = 4;
//                int n2 = 3;
//                int m = 4;
                alfa = functionService.calculateFunction4(fiWave);
                beta = functionService.calculateFunction3(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction4(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 22:
//                int n1 = 4;
//                int n2 = 4;
//                int m = 2;
                alfa = functionService.calculateFunction4(fiWave);
                beta = functionService.calculateFunction4(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction2(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 23:
//                int n1 = 4;
//                int n2 = 5;
//                int m = 2;
                alfa = functionService.calculateFunction4(fiWave);
                beta = functionService.calculateFunction5(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction2(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 24:
//                int n1 = 4;
//                int n2 = 6;
//                int m = 1;
                alfa = functionService.calculateFunction4(fiWave);
                beta = functionService.calculateFunction6(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction1(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 25:
//                int n1 = 5;
//                int n2 = 1;
//                int m = 5;
                alfa = functionService.calculateFunction5(fiWave);
                beta = functionService.calculateFunction1(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction5(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 26:
//                int n1 = 5;
//                int n2 = 2;
//                int m = 4;
                alfa = functionService.calculateFunction5(fiWave);
                beta = functionService.calculateFunction2(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction4(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 27:
//                int n1 = 5;
//                int n2 = 3;
//                int m = 4;
                alfa = functionService.calculateFunction5(fiWave);
                beta = functionService.calculateFunction3(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction4(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 28:
//                int n1 = 5;
//                int n2 = 4;
//                int m = 1;
                alfa = functionService.calculateFunction5(fiWave);
                beta = functionService.calculateFunction4(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction1(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 29:
//                int n1 = 5;
//                int n2 = 5;
//                int m = 1;
                alfa = functionService.calculateFunction5(fiWave);
                beta = functionService.calculateFunction5(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction1(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 30:
//                int n1 = 5;
//                int n2 = 6;
//                int m = 1;
                alfa = functionService.calculateFunction5(fiWave);
                beta = functionService.calculateFunction6(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction1(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 31:
//                int n1 = 6;
//                int n2 = 1;
//                int m = 3;
                alfa = functionService.calculateFunction6(fiWave);
                beta = functionService.calculateFunction1(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction3(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 32:
//                int n1 = 6;
//                int n2 = 2;
//                int m = 3;
                alfa = functionService.calculateFunction6(fiWave);
                beta = functionService.calculateFunction2(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction3(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 33:
//                int n1 = 6;
//                int n2 = 3;
//                int m = 3;
                alfa = functionService.calculateFunction6(fiWave);
                beta = functionService.calculateFunction3(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction3(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 34:
//                int n1 = 6;
//                int n2 = 4;
//                int m = 1;
                alfa = functionService.calculateFunction6(fiWave);
                beta = functionService.calculateFunction4(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction1(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 35:
//                int n1 = 6;
//                int n2 = 5;
//                int m = 1;
                alfa = functionService.calculateFunction6(fiWave);
                beta = functionService.calculateFunction5(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction1(muWave);
                hi = Math.min(gamma, delta);
                return hi;

            case 36:
//                int n1 = 6;
//                int n2 = 6;
//                int m = 1;
                alfa = functionService.calculateFunction6(fiWave);
                beta = functionService.calculateFunction6(omegaWave);
                gamma = Math.min(alfa, beta);
                delta = functionService.calculateFunction1(muWave);
                hi = Math.min(gamma, delta);
                return hi;
        }
        return hi;
    }

}
