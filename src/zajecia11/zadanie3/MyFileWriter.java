package zajecia11.zadanie3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyFileWriter {

    public static void writeOperationLinesCalculations(String fileName, List<OperationLine> operationLineList) {

        try (
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            for (int i = 0; i < operationLineList.size(); i++) {
                writer.write(operationLineList.get(i).toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
