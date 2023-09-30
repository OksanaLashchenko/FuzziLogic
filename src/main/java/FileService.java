import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public static String COMMA_DELIMITER = ",";
    public static String CURSOR = "\n";

    public FileService() {
    }

    public void saveToScv(List<DataObject> dataObjectList) throws IOException {
        File csvFile = new File("fuzzy_logic_6_variant.csv");
        FileWriter fileWriter = new FileWriter(csvFile);
        List<String> stringPoints = mapDataToStrings(dataObjectList);
        for (String stringPoint : stringPoints) {
            fileWriter.write(stringPoint);
        }
        fileWriter.close();
    }

    private List<String> mapDataToStrings(List<DataObject> dataObjectList) {
        List<String> result = new ArrayList<>();
        StringBuilder headerLine = new StringBuilder();
        headerLine.append("Time")
                .append(COMMA_DELIMITER)
                .append("Angle")
                .append(COMMA_DELIMITER)
                .append("Angle speed")
                .append(COMMA_DELIMITER)
                .append("Сontrol angular acceleration")
                .append(CURSOR);
        for (DataObject dataObject : dataObjectList) {
            StringBuilder line = new StringBuilder();
            line.append(dataObject.getT())
                    .append(COMMA_DELIMITER)
                    .append(dataObject.getFi())
                    .append(COMMA_DELIMITER)
                    .append(dataObject.getOmega())
                    .append(COMMA_DELIMITER)
                    .append(dataObject.getMu())
                    .append(CURSOR);
            result.add(line.toString());
        }
        result.add(0, headerLine.toString());
        return result;
    }

}
