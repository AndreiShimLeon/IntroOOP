package SeminarTests;

import java.math.BigDecimal;

public class CreditCard {

    private static final BigDecimal DEFAULT_COMMISSION = BigDecimal.valueOf(0.01);
    private static final BigDecimal DEFAULT_VALUE = BigDecimal.ZERO;
    private BigDecimal commission;
    private BigDecimal value;

    private final MyNotifier notifier;

    public CreditCard(MyNotifier notifier){
        this(notifier, DEFAULT_COMMISSION, DEFAULT_VALUE);
    }

    protected CreditCard(MyNotifier notifier, BigDecimal commission, BigDecimal value) {
        this.commission = commission;
        this.value = value;
        this.notifier = notifier;
    }

    public void put(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Сумма меньше нуля");
        }
        this.value = value.add(amount); // сложение
        notifier.notifyMessage();
    }

    public void take(BigDecimal amount){
        BigDecimal withCommision = amount.multiply(commission).add(amount);
        this.value = value.subtract(withCommision); // вычитание
        notifier.notifyMessage();
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
