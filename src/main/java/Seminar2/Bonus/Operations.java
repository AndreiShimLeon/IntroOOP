package Seminar2.Bonus;

public class Operations {

    public String getBalance(Card card){
        return  "Остаток на счету "+ card.getBalance();
    }

    public String withdrawal(Card card, double amount){
        if(card.withdrawal(amount)) return "Со счета снято "+ amount;
        return "Снятие со счета невозможно";
    }
    public String depost(Card card, double amount){
        if(card.deposit(amount)) return "На счет внесено "+ amount;
        return "Внесение на счет невозможно";
    }

}
