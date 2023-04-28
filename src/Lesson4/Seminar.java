package Lesson4;

import java.util.*;

public class Seminar {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        boolean isCorrect = true;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                deque.push(currentChar);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                if (!deque.isEmpty()) {
                    char lastChar = deque.pop();
                    if ((lastChar == '(' && currentChar != ')') ||
                            (lastChar == '{' && currentChar != '}') ||
                            (lastChar == '[' && currentChar != ']')) {
                        isCorrect = false;
                        break;
                    }
                } else {
                    isCorrect = false;
                    break;
                }
            }
        }

        if (!deque.isEmpty()) {
            isCorrect = false;
        }

        System.out.println(isCorrect);
    }
}
