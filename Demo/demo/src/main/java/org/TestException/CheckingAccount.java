package pers.han.TestException;

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

        CheckingAccount CA = new CheckingAccount();
        CA.deposit();
        try {
            CA.withdraw();
        } catch (DeficitException e) {
            CA.setOverdraftProtection(e.getDeficit());
            System.out.println("You should repay: "+ CA.getOverdraftProtection());
        }


    }

}
