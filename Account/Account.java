public class Account {
    private int balance;;
    private int pin;

    public int getBalance() {
        return balance;
    }

    public Account(int userPin){
        this.pin = userPin;
    }

    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(int amount, int userPin) {
        if (amount <= balance && amount > 0 && userPin == pin)
            balance -= amount;
    }

}
