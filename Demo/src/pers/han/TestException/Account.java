package pers.han.TestException;

import java.util.Scanner;

public class Account {

    private double balance;
    private Scanner scanner;
    private Scanner scan;

    Account() {
        scanner = new Scanner(System.in);
        scan = new Scanner(System.in);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit() {

        System.out.println("How much do you deposit: ");
        double deposit = scanner.nextDouble();
        setBalance(deposit);
        System.out.println("Done\nYour balance: "+getBalance());

    }

    public void withdraw() throws DeficitException {

            System.out.println("How much do you withdraw: ");
            double withdraw = scanner.nextDouble();
            double withdrawBalance = balance - withdraw;
            if (withdrawBalance >= 0) {
                balance = withdrawBalance;
            } else if (withdrawBalance < 0) {
                throw new DeficitException("OverDraft!", (withdrawBalance * -1));
            }
            System.out.println("Done\nYour balance: " + getBalance());

    }

    public static void main(String[] args) {

    }

}
