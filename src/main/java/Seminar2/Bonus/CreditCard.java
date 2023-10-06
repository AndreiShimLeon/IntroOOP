package Seminar2.Bonus;

public class CreditCard extends AbstractCard{
    private static final double commission = 0.01;

    public CreditCard(double balance) {
        super(balance);
    }

    @Override
    public boolean withdrawal(double withdrawal) {
        if ((withdrawal + withdrawal * commission) <= getBalance()) {
            this.balance -= withdrawal + withdrawal * commission;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "balance=" + balance +
                "} ";
    }
}
