package zajecia11.zadanie3;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String fileName = "src/zajecia11/zadanie3/examples.txt";
        List<OperationLine> operationLines = MyFileReader.operationsReader(fileName);
        List<OperationLine> operationLinesWithResults = OperationLineReader.runCalculations(operationLines);
        MyFileWriter.writeOperationLinesCalculations("src/zajecia11/zadanie3/results.txt", operationLinesWithResults);
    }
}
