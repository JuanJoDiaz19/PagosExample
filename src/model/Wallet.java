package model;

import invalidAmmountExecptions.InvalidAmmountException;
import invalidAmmountExecptions.NotEnoughMoneyException;

import java.util.ArrayList;

public class Wallet {
    private ArrayList<Debt> debts;
    private ArrayList<Income> incomes;

    public Wallet() {
        debts = new ArrayList<>();
        incomes = new ArrayList<>();
    }

    public void addDebt(double value) throws InvalidAmmountException{
        Debt d = new Debt(value);
        debts.add(d);
    }

    public void addIncome(double value) throws InvalidAmmountException {
        Income e = new Income(value);
        incomes.add(e);
    }

    public void pay(double value) throws  NotEnoughMoneyException, InvalidAmmountException{
        double totalDebts = 0;
        for(Debt debt: debts) {
            totalDebts+= debt.getValue();
        }
        double totalIncomes = 0;
        for(Income income: incomes) {
            totalIncomes+= income.getValue();
        }

        double total = totalIncomes - totalDebts;
        if(value >= total) {
            throw new NotEnoughMoneyException(total, value);
        } else {
            addDebt(value);
        }

    }
}
