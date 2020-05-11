package zajacia10.zadanie2;

import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {
        Person me = new Person("Beata", "Sadek", "788767564");
        Person nobody = null;
        BankAccount bankAccount = null;

        try {
            bankAccount = new BankAccount(me, 3500);

            switch (getClientChoice()) {
                case 1:
                    bankAccount.deposit(getCashAmount());
                    break;
                case 2:
                    bankAccount.withdraw(getCashAmount());
                    break;
                default:
                    System.out.println("Incorrect choice");
            }
        } catch (NullPointerException e) {
            System.out.println("Person cannot be null");
        } catch (TooHighCreditAmountException | WithdrawMaxAmountException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Bank account balance is: " + bankAccount.getBalance());

    }
    public static int getClientChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to cash machine. The options are as below: \n 1. Deposit money \n 2. Withdraw money");
        return scanner.nextInt();
    }

    public static double getCashAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the money amount");
        return scanner.nextDouble();
    }
}
