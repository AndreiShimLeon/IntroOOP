package Seminar4.Task1;

import java.util.List;

public interface UserController<T extends User> {
    public T create(String name, String secondName, String middleName);
}
