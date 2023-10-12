package SeminarTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTest {

    @Test
    public void sumEmptyListTest(){
        Homework homework = new Homework();
        List<Integer> list = new ArrayList<>();
        Assertions.assertEquals(homework.sum(list), 0);
    }
    @Test
    public void sumListTest(){
        Homework homework = new Homework();
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        Assertions.assertEquals(homework.sum(list), 55);
    }

    @Test
    public void hasExactlyTrueTest(){
        Homework homework = new Homework();
        List<String> list = new ArrayList<>(List.of("item"));
        String item = "item";
        Assertions.assertTrue(homework.hasExactly(list,item));
    }
    @Test
    public void hasExactlyWrongItem(){
        Homework homework = new Homework();
        ArrayList<String> items = new ArrayList<>(List.of("items"));
        String item = "item";
        Assertions.assertFalse(homework.hasExactly(items, item));
    }

    @Test
    public void hasExactlyBigList(){
        Homework homework = new Homework();
        ArrayList<String> items = new ArrayList<>(List.of("item", "item"));
        String item = "item";
        Assertions.assertFalse(homework.hasExactly(items, item));
    }
    @Test
    public void hasExactlyEmptyList(){
        Homework homework = new Homework();
        ArrayList<String> items = new ArrayList<>();
        String item = "item";
        Assertions.assertFalse(homework.hasExactly(items, item));
    }


    @Test
    public void copyFilledLists(){
        Homework homework = new Homework();
        List<Integer> target = new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Integer> source = new ArrayList<>(List.of(7,8,9,10));
        homework.copy(source,target);
        boolean result = source.isEmpty() && (target.size() == 10);
        Assertions.assertTrue(result);
    }
    @Test
    public void copyOneFilledList(){
        Homework homework = new Homework();
        List<Integer> target = new ArrayList<>();
        List<Integer> source = new ArrayList<>(List.of(7,8,9,10));
        homework.copy(source,target);
        boolean result = source.isEmpty() && (target.size() == 4);
        Assertions.assertTrue(result);
    }

    @Test
    public void copyAnotherFilledList(){
        Homework homework = new Homework();
        List<Integer> target = new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Integer> source = new ArrayList<>();
        homework.copy(source,target);
        boolean result = source.isEmpty() && (target.size() == 6);
        Assertions.assertTrue(result);
    }
    @Test
    public void copyEmptyLists(){
        Homework homework = new Homework();
        List<Integer> target = new ArrayList<>();
        List<Integer> source = new ArrayList<>();
        homework.copy(source,target);
        boolean result = source.isEmpty() && target.isEmpty();
        Assertions.assertTrue(result);
    }

}
