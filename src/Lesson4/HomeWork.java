package Lesson4;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if ("exit".equals(input))
                break;
            if ("print".equals(input)) {
                System.out.println(deque);
            } else if ("revert".equals(input)) {
                if (!deque.isEmpty()) {
                    deque.removeFirst();
                }
            } else {
                deque.addFirst(input);
            }
        }
    }
}

