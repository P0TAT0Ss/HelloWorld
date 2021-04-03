package org.TestException;

/**
 * @author OS
 */
public class CheckingAccount extends Account {

    private double overdraftProtection;

    CheckingAccount() {
        super();

    }

    public void setOverdraftProtection(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    public static void main(String[] args) {

        CheckingAccount checkAccount = new CheckingAccount();
        checkAccount.deposit();
        try {
            checkAccount.withdraw();
        } catch (DeficitException e) {
            checkAccount.setOverdraftProtection(e.getDeficit());
            System.out.println("You should repay: "+ checkAccount.getOverdraftProtection());
        }


    }

}
