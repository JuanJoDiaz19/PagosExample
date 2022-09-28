package ui;

import invalidAmmountExecptions.InvalidAmmountException;
import invalidAmmountExecptions.NotEnoughMoneyException;
import model.User;



public class Main {
    public static void main(String[] args) {

        try {
            User user = new User();
            user.getWallet().addIncome(10000);
            user.getWallet().addDebt(2000);
            user.getWallet().pay(8500);
        } catch (NotEnoughMoneyException ex) {
            ex.printStackTrace();
        } catch (InvalidAmmountException ex){
            ex.printStackTrace();
        }
        System.out.println("Hello World");
    }
}
