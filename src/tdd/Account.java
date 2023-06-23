package tdd;

import java.util.Objects;

public class Account {
    private int balance;
    private final String pin;

    public Account(String pin){
        this.pin = pin;
    }

    public int getBalance(String pin) {
        if (Objects.equals(this.pin, pin)){
            return balance;
        }
        else {
            System.out.println("Incorrect pin");
            return 0;
        }
    }

    public void deposit(int amount) {
        if (amount > 0){
            balance += amount;
        }
        else {
            System.out.println("Can't Deposit That Amount");
        }
    }

    public void withdraw(int amount, String pin) {
        if (Objects.equals(this.pin, pin)){
            if (amount > 0 && amount <= balance){
                balance -= amount;
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Incorrect Pin");
        }
    }


}
