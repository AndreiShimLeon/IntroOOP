package Seminar3.Intro;


import java.util.*;

class Person implements Comparable<Person> {
    //class Person{
    int age;
    String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
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
        return "Person{" + age + ' ' + name + '\'' +
                '}' + "\n";
    }

    @Override
    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);
        return Integer.compare(this.age, o.age);
    }
}

class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age, o2.age);
    }
}

class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

class PersonDB implements Iterable<Person> {
    public ArrayList<Person> db = new ArrayList<>();

    @Override
    public String toString() {
        return "PersonDB{" +
                "db=\n" + db +
                '}';
    }

    public void add(Person person) {
        db.add(person);
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

    class PersonIterator implements Iterator<Person> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < db.size();
        }

        public Person next() {
            if (hasNext()) {
                return db.get(currentIndex++);
            }
            throw new java.util.NoSuchElementException();
        }
    }
}

public class Program {
    public static void main(String[] args) {
        PersonDB db = new PersonDB();
        db.add(new Person("Хвост собачий", 44));
        db.add(new Person("Лиса", 51));
        db.add(new Person("Леший", 4));
        db.add(new Person("Дворовый", 25));

        for (Person person : db
        ) {
            System.out.println(person);
        }


//        TreeSet<Person> listOfPerson = new TreeSet<>(new AgeComparator());
        ArrayList<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person("Хвост собачий", 44));
        listOfPerson.add(new Person("Лиса", 51));
        listOfPerson.add(new Person("Леший", 4));
        listOfPerson.add(new Person("Дворовый", 25));

        System.out.println(listOfPerson);
//        Collections.sort(listOfPerson);
//        System.out.println(listOfPerson);

        listOfPerson.sort(new NameComparator());
        System.out.println(listOfPerson);
        listOfPerson.sort(new AgeComparator());
        System.out.println(listOfPerson);
    }
}
