package Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class HomeWork {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(-5);
        numbers.add(-15);
        removeEvenNumber(numbers);
        System.out.println(numbers); // [40, -15]
    }

    private static void removeEvenNumber(List<Integer> numbers) {
        numbers.removeIf(e -> (numbers.indexOf(e) % 2) == 0);
    }

    static boolean stringConv(String strings){
        try{
            Integer.parseInt(strings);
            return true;
        }catch (NumberFormatException e) {
        }
        return false;
    }


   static void removeIntegers(List<String> strings) {
        strings.removeIf(e -> stringConv(e));
    }
}
