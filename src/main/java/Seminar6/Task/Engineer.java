package Seminar6.Task;

interface Worker{
    void work();
    void eat();

}
public class Engineer implements Worker{
    @Override
    public void work() {
        // реализация работы инженера
    }

    @Override
    public void eat() {
        // реализация приема пищи

    }
}
