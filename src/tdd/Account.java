package tdd;

public class Account {
    private int balance;
    private String pin = "\\d+";

    public Account(String pin){
        this.pin = pin;
    }

    public int getBalance(String pin) {
        if(this.pin != pin)return 0;
        this.pin = pin;
        return balance;
    }

    public void deposit(int amount) {
        if(amount < 0) return;
        balance += amount;
    }

    public void withdraw(int amount, String pin) {
        if(amount < 0) return;
        if (amount > balance) return;
        balance -= amount;
        if(this.pin != pin)return;
        this.pin = pin;
    }

}
