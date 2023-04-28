package Lesson5;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }
    static boolean isCorrectParentheses(String parentheses) {
        Map<Character, Character> bracket = new HashMap<>();
        bracket.put(')', '(');
        bracket.put('}', '{');
        bracket.put(']', '[');

        Deque<Character> cash = new LinkedList<>();
        for (char c : parentheses.toCharArray()) {
            if (bracket.containsValue(c)) {
                cash.push(c);
            } else if (bracket.containsKey(c)) {
                if (cash.isEmpty() || cash.pop() != bracket.get(c)) {
                    return false;
                }
            }
        }return cash.isEmpty();
    }
}
