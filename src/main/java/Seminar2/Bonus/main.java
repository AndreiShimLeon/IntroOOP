package Seminar2.Bonus;

import java.util.Dictionary;

public class main {
    public static void main(String[] args) {
        Card credit = new CreditCard(50_000);
        Card debit = new DebitCard(100_000);
        Card fixed = new FixedCard(1_100_000);

        Operations operations = new Operations();

        System.out.println(operations.getBalance(credit));
        System.out.println(operations.withdrawal(credit, 20_000));
        System.out.println(operations.getBalance(credit));
        System.out.println(operations.withdrawal(credit, 29_800));
        System.out.println(operations.getBalance(credit));
        System.out.println(operations.depost(credit, 29_800));
        System.out.println(operations.getBalance(credit));
        System.out.println("*".repeat(199));


        System.out.println(operations.getBalance(fixed));
        System.out.println(operations.withdrawal(fixed, 20_000));
        System.out.println(operations.getBalance(fixed));
        System.out.println(operations.withdrawal(fixed, 29_800));
        System.out.println(operations.getBalance(fixed));
        System.out.println(operations.depost(fixed, 29_800));
        System.out.println(operations.getBalance(fixed));
        System.out.println("*".repeat(199));


        System.out.println(operations.getBalance(debit));
        System.out.println(operations.withdrawal(debit, 20_000));
        System.out.println(operations.getBalance(debit));
        System.out.println(operations.withdrawal(debit, 29_800));
        System.out.println(operations.getBalance(debit));
        System.out.println(operations.depost(debit, 29_800));
        System.out.println(operations.getBalance(debit));
        System.out.println("*".repeat(199));
    }
}       
