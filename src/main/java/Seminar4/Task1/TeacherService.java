package Seminar4.Task1;

public class TeacherService<T extends Teacher> {
    public T create(String name, String surname, String patronymic){
        if(!name.isEmpty()  && !surname.isEmpty()){
            return (T) new Teacher(name, surname, patronymic);
        }
        return null;
    }
}
