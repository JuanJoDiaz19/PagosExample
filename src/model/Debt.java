package model;

import invalidAmmountExecptions.InvalidAmmountException;

public class Debt {
    private double value;


    public Debt(double value) throws InvalidAmmountException {
        if(value <= 0) {
            throw new InvalidAmmountException(value);
        } else {
            this.value = value;
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
