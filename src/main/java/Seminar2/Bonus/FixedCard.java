package Seminar2.Bonus;

public class FixedCard extends AbstractCard{

    public FixedCard(double balance) {
        super(balance);
    }

    @Override
    public boolean deposit(double deposit) {
        return false;
    }

    @Override
    public boolean withdrawal(double withdrawal) {
        return false;
    }

    @Override
    public String toString() {
        return "FixedCard{" +
                "balance=" + balance +
                "} ";
    }
}
