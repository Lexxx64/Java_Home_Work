package Lesson2;

public class Seminar {
    public static void main(String[] args) {
        printPlus(1000);
        printName();
    }
    private static void printPlus (int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++)
            sb.append("+");
        System.out.println(sb);
    }

    private static void printName(){
        String[] name = {"С", "е", "р", "г", "е", "й"};
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); //сергей ка.
        System.out.println(String.join("", name));// Сергей
        System.out.println(String.join("", "C", "е","р", "г", "е", "й")); // Сергей
        System.out.println(String.join(",", "C", "е","р", "г", "е", "й"));// С,е,р,г,е,й
    }
}
