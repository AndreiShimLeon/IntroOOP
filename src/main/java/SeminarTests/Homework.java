package SeminarTests;

import java.util.List;

public class Homework {

    /*Реализовать и протестировать методы, описанные в данном классе.
     *
     * Чтобы тесты заработали:
     * 1. Создать maven-проект;
     * 2. Подключить в pom.xml зависимость на junit
     * 3. Создать класс HomeworkTest в директории src/test/java в том же пакете
     *
     */

    /*
     * Возвращает сумму чисел.
     * Протестировать следующие сценарии:
     * 1. Список пустой (тогда возвращаем 0)
     * 2. Список не пустой
     *
     * Создаете список, проверяете, что сумма совпадает с возвращаемым методом
     */

    public int sum(List<Integer> ints) {
        // FIXME Реализовать, если список пустой, возвращаем 0
        int result = 0;
        for (int integer : ints
        ) {
            result += integer;
        }
        ;
        return result;
    }


        /*
        Проверяет, что список содержит только один элемент.
        Протестировать сценарии:
        1. Список содержит только один элемент и он совпадает с item -> TRUE
        2. Список содержит только один элемент и он НЕ совпадает с item -> FALSE
        3. Список содержит несколько элементов, среди которых есть item -> FALSE
        4. Список пустой -> FALSE
         */

    public boolean hasExactly(List<String> items, String item) {
        // FIXME Реализовать
        if (items.isEmpty()) return false;
        else if (items.size() == 1 && items.get(0).equals(item)) return true;
        return false;
    }

    /*
          Задача со звездочкой
          Перекидывает из source (source после становится пустым) в target все элементы
          (проверить наличие всех элементов в target + ничего не удаляется)
          Протестировать сценарии:
          1. Оба списка не пустые;
          2. Первый список пустой, второй нет;
          3. Второй список пустой, первый нет;
          4. Оба списка пустые
           */
    public <T> void copy(List<? extends T> source, List<? super T> target) {
        //FIXME реализовать
        if(!source.isEmpty()){
            for (int i = 0; i < source.size(); i++) {
                target.add(source.get(i));
            }
        }
        source.clear();
    }
}
