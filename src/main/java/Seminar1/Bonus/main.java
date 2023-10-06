package Seminar1.Bonus;

public class main {
    public static void main(String[] args) {
        Card credit = new CreditCard(50_000);
        Card debit = new DebitCard(100_000);


        System.out.println(credit);
        credit.withdrawal(10000);
        System.out.println(credit);
        credit.withdrawal(40000);
        System.out.println(credit);


        System.out.println(debit);
        debit.withdrawal(10000);
        debit.withdrawal(10000);
        debit.withdrawal(10000);
        debit.withdrawal(10000);

        System.out.println(debit);

    }
}
