package zajecia11.zadanie3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {

    public static List<OperationLine> operationsReader(String fileName) {
        List<OperationLine> operationLineList = new ArrayList<>();

        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String nextLine = null;

            while ((nextLine = bufferedReader.readLine()) != null) {
                Scanner scanner = new Scanner(nextLine);
                scanner.useDelimiter(" ");
                while (scanner.hasNext()) {
                    String element1 = scanner.next();
                    String sign = scanner.next();
                    String element2 = scanner.next();
                    OperationLine operationLine = new OperationLine(element1, sign, element2);
                    System.out.println(operationLine);
                    operationLineList.add(operationLine);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return operationLineList;
    }
}



