package Lesson2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите чётное число: ");
            num = s.nextInt();
        }while (num <= 0 || num % 2 != 0);

        System.out.println(buildString(num, 'ч', 'а'));
    }

    static String buildString(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++)
            sb.append(c1).append(c2);
            return sb.toString();
    }
}
