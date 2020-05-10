package zajacia10.zadanie2;

public class TooHighCreditAmountException extends RuntimeException {
    public TooHighCreditAmountException(double credit, double balance) {
        System.err.println("You're trying to withdraw too high amount. You balance account is " + balance + " " +
                ", so the withdrawing amount is " + (credit - balance) + " too high");
    }
}
