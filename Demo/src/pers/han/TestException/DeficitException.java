package pers.han.TestException;

public class DeficitException extends Exception {

    private double deficit;

    DeficitException(String message,double deficit) {

        super(message);
        setDeficit(deficit);
        getDeficit();

    }

    public void setDeficit(double deficit) {
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
