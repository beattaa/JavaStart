package zajacia10.zadanie2;

import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {
        Person me = new Person("Beata", "Sadek", "788767564");
        Person nobody = null;
        BankAccount bankAccount = null;
        switch (getClientChoice()) {
            case 1:
                try {
                    bankAccount = new BankAccount(me, 3500);
                    bankAccount.deposit(getCashAmount());
                } catch (NullPointerException e) {
                    System.out.println("Person cannot be null");
                }
                break;
            case 2: {
                try {
                    bankAccount = new BankAccount(me, 3500);
                    bankAccount.withdraw(getCashAmount());
                } catch (NullPointerException e) {
                    System.out.println("Person cannot be null");
                } catch (TooHighCreditAmountException | WithdrawMaxAmountException e) {
                    System.err.println(e.getMessage());
                }

                break;
            }
            default:
                System.out.println("Incorrect choice");
        }
        try {
            System.out.println("Bank account balance is: " + bankAccount.getBalance());
        } catch (NullPointerException e) {
            System.out.println("No bank account was used in this operation");
        }
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
