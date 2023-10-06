package Seminar2.Bonus;

public abstract class AbstractCard implements Card{
    protected double balance;

    @Override
    public double getBalance() {
        return balance;
    }

    public AbstractCard(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean deposit(double deposit) {
        if(deposit > 0){
            this.balance += deposit;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdrawal(double withdrawal) {
        if(this.balance >= withdrawal){
            this.balance -= withdrawal;
            return true;
        }
        return false;
    }


}
