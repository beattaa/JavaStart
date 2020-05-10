package zajacia10.zadanie2;

public class WithdrawMaxAmountException extends RuntimeException {
    public WithdrawMaxAmountException(double credit, double max) {
        System.err.println("Credit amount " + credit + " is above the limit set to " + max + ".");
    }
}
