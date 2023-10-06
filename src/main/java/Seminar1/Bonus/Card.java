package Seminar1.Bonus;

public class Card {
    protected double balance;

    public Card(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdrawal(double withdrawal) {
        if(withdrawal <= getBalance()) {
            this.balance -= withdrawal;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Card{" +
                "balance=" + balance +
                '}';
    }
}
