package Seminar4.Bonus;

import Seminar2.Bonus.FixedCard;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.List;

public class Program {
    public static void main(String[] args) {
//        List<Integer> ints = new ArrayList<>();
//        List ints2 = new ArrayList();
//        ints2.add("String");
//        ints2.add(123);
//        ints2.add(new Object());
//
//        String first = (String) ints2.get(0);

        CardHolder <Card> cardHolder = new CardHolder<>();
//        CardHolder <String> stringCardHolder = new CardHolder<>();
        cardHolder.addCard(new CreditCard());
        cardHolder.addCard(new DepositCard());



        List<First> firsts = new ArrayList<>();
        List<Second> seconds = new ArrayList<>();
        List<Third> thirds = new ArrayList<>();
        List<Fourth> fourths = new ArrayList<>();
        List<Fifth> fifths = new ArrayList<>();
foo(firsts);
foo(seconds);
foo(thirds);
foo(fourths);
foo(fifths);


    }

//        static<T extends First> void foo(List<T> list){}
        static void foo(List<? extends First> list){}
        class First{}
        class Second extends First{}
        class Third extends Second{}
        class Fourth extends Third{}
        class Fifth extends Fourth{}
}
