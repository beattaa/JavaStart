package zajecia11.zadanie3;

public class OperationLine {
    private final String element1;
    private final String operationSign;
    private final String element2;
    private double result;

    public OperationLine(String element1, String operationSign, String element2) {
        this.element1 = element1;
        this.operationSign = operationSign;
        this.element2 = element2;
    }

    @Override
    public String toString() {
        return element1 + " " + operationSign + " " + element2 + " = " + result;
    }

    public String getElement1() {
        return element1;
    }

    public String getOperationSign() {
        return operationSign;
    }

    public String getElement2() {
        return element2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
