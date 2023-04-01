package Lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        Scanner s = new Scanner(System.in);
        System.out.println("Введите год");
        int year = s.nextInt();
        System.out.println(isLeapYear(year));

        printArray(createArray(5, 15)); // 15 15 15 15 15

        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray(replaceArray(myArray)); // 0 0 1 1 0 1 0 0 1 1

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(multiplyArray(arr)); // 2 10 6 4 11 8 10 4 8 8 9 2

        newArray(11);

    }

    private static boolean isSumBetween10And20(int a, int b) {
        int c = Integer.sum(a, b);
        if (10 <= c && c <= 20) return true;
        return false;
    }

    private static boolean isPositive(int x) {
        if (x > 0) return true;
        return false;
    }

    private static void printString(String source, int repeat) {
        System.out.println(source.repeat(repeat));
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return true;
        return false;
    }

    private static int[] createArray(int len, int initialValue) {
        int[] myArray = new int[len];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = initialValue;
        }
        return myArray;
    }

    // метод печати одномерного массива
    private static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

//    // метод печати двумерного массива
//    private static void print2DArray(int[][] myArray){
//        for (int i = 0; i < myArray.length; i++){
//            for (int j = 0; j < myArray[i].length; j++){
//                System.out.println(myArray[i][j] + " ");
//            }
//        }
//        System.out.println();
//    }

    private static int[] replaceArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (myArray[i] == 1) ? 0 : 1;
        }return myArray;
    }

    private static int[] multiplyArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] < 6) myArray[i] *= 2;
        }return myArray;
    }

    private static void newArray(int len){
        int [][] newArray = new int[len][len];
        for (int i = 0; i < newArray.length; i++){
            for (int j = 0; j < newArray[i].length; j++){
                if (i + j + 1 == len || i == j){
                    newArray[i][j] = 1;
                }
                else {
                    newArray[i][j] = 0;
                }
            }
        }System.out.println(Arrays.deepToString(newArray).replace("], ", "]\n"));
    }
}
