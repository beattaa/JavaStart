package zajecia11.zadanie3;

public class MathExpression {

    public static double calculator(String c, int a, int b) {

        switch (c) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                try {
                    return a / b;
                } catch (ArithmeticException e) {
                    System.err.println("Cannot divide by zero \n" + e.getMessage());
                }
        }
        return 0;
    }

}
