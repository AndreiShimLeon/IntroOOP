package Seminar2.Bonus;

import java.time.LocalDateTime;

public class DebitCard extends AbstractCard{

    LocalDateTime lastOperation;

    public DebitCard(double balance) {
        super(balance);
    }

    @Override
    public boolean withdrawal(double withdrawal) {
        if (lastOperation == null || LocalDateTime.now().minusDays(1).isAfter(this.lastOperation)) {
            this.lastOperation = LocalDateTime.now();
            return super.withdrawal(withdrawal);
        }
        return false;
    }

    public String toString() {
        return "DebitCard{" +
                "lastOperation=" + lastOperation +
                ", \nbalance=" + balance +
                "} ";
    }
}
