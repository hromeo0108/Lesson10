import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
    //Избавиться от повторяющихся элементов в строке.
    //Вывести результат на экран.

public class Task1 {
    public static void main(String[] args) {

        String set1 = "1, 2, 3, 4, 4, 5, 5";

        set1 = set1.replaceAll(", ","");
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < set1.length(); i++) {
               set.add(set1.charAt(i));
        }
        System.out.println(set);
    }
}
