package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    }

    private static void removeIntegers(List<String> strings) {
        strings.removeIf(e -> (strings.indexOf(e) % 2) == 0);
    }

}
