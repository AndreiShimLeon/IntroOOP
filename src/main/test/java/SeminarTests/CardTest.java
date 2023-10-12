package SeminarTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;

import java.math.BigDecimal;

public class CardTest {
    @Test
    void testNotifyAfterPut() {
        MyNotifier notifier = Mockito.mock(MyNotifier.class);
        CreditCard card = new CreditCard(notifier, BigDecimal.valueOf(0.01), BigDecimal.valueOf(1000));

        card.put(BigDecimal.TEN);
        Mockito.verify(notifier).notifyMessage(); // проверяем отправку сообщения

    }
    @Test
    void testNotNotifyAfterIllegalPut() {
        MyNotifier notifier = Mockito.mock(MyNotifier.class);
        CreditCard card = new CreditCard(notifier, BigDecimal.valueOf(0.01), BigDecimal.valueOf(1000));
        try {
            card.put(BigDecimal.valueOf(-10));
        } catch (Exception ignore){}
        Mockito.verifyNoInteractions(notifier); // проверяем отсутствие взаимодействия сообщения

    }
@Test
    void testTake(){
        CreditCard card = new CreditCard(new MyNotifier(), BigDecimal.valueOf(0.01), BigDecimal.valueOf(1000));
        card.take(BigDecimal.valueOf(100));
        BigDecimal expected = BigDecimal.valueOf(899);
        BigDecimal actual = card.getValue();
        int compare = actual.compareTo(expected); // если равны, то значение от compareTo будет == 0
        Assertions.assertEquals(compare, 0);

    }
    @Test
    void testPutNegative(){
        CreditCard card = new CreditCard(new MyNotifier(), BigDecimal.valueOf(0.01), BigDecimal.valueOf(1000));
        Assertions.assertThrows(IllegalArgumentException.class, () -> card.put(BigDecimal.valueOf(-100)), "Сумма меньше нуля");
    }
    @Test
    void testPut(){
        CreditCard card = new CreditCard(new MyNotifier(), BigDecimal.valueOf(0.01), BigDecimal.valueOf(1000));
        card.put(BigDecimal.valueOf(100));
        BigDecimal expected = BigDecimal.valueOf(1100);
        BigDecimal actual = card.getValue();
        Assertions.assertEquals(expected, actual);
    }
}
