package Seminar1.Part1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Barsik");
        cat1.setAge(12);
        cat1.PrintInfo();
        Cat cat2 = new SiberianCat();
        cat2.setName("Hoho");
        cat2.setAge(5);
        cat2.PrintInfo();
    }

}
