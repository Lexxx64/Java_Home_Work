package Lesson4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Seminar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> storage = new LinkedList<>();
        String input = sc.nextLine();
        String[] pair =  input.split("~");
        if (pair.length != 2){
            throw new IllegalArgumentException();
        }
    }
}
