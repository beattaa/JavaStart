package zajacia10.zadanie2;

public class BankAccount {
    private static final double WITHDRAW_MAX_AMOUNT = 1000;
    private final Person person;
    private double balance;

    public BankAccount(Person person, double balance) {
        if (person == null)
            throw new NullPointerException();
        this.person = person;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double credit) {
        if (credit > balance)
            throw new TooHighCreditAmountException(credit, balance);
        if (credit > WITHDRAW_MAX_AMOUNT)
            throw new WithdrawMaxAmountException(credit, WITHDRAW_MAX_AMOUNT);
        balance -= credit;
    }


}
