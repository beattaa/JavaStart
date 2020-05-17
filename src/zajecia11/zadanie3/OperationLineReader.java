package zajecia11.zadanie3;

import java.util.List;

public class OperationLineReader {
    public static int readElement(String element) {
        return Integer.valueOf(element);
    }

    public static List<OperationLine> runCalculations(List<OperationLine> operationLines) {
        for (int i = 0; i < operationLines.size(); i++) {
            int a = OperationLineReader.readElement(operationLines.get(i).getElement1());
            String operationSign = operationLines.get(i).getOperationSign();
            int b = OperationLineReader.readElement(operationLines.get(i).getElement2());
            double result = MathExpression.calculator(operationSign, a, b);
            operationLines.get(i).setResult(result);
        }
        return operationLines;
    }
}
