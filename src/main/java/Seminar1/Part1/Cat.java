package Seminar1.Part1;

public class Cat {
    protected int age;
    protected String name;

    public void PrintInfo(){
        System.out.println("meow! My name is " + name +
                ". My age is " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
