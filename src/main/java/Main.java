import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MainService mainService = new MainService(Math.toRadians(-30.0), Math.toRadians(5.0), 0.0, -100, 0.0, 0.0);
        mainService.getResult();
    }

}
