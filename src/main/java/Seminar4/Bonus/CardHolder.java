package Seminar4.Bonus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CardHolder <T extends Card> {
    private List<T> cards = new ArrayList<>();

    public void addCard(T card){
        cards.add(card);
    }

    public List<T> getCards() {
        return cards;
    }
}
