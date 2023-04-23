package Lesson4;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> inputList = new ArrayDeque<>();
        while (true) {
            String input;
            while (!(input = sc.nextLine()).equals("print"))
                inputList.addFirst(input);
            inputList.removeIf(x -> inputList.remove("revert"));
            System.out.println(inputList);
        }
    }
}

