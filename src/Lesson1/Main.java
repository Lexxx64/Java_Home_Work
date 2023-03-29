package Lesson1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array = {1, 1, 0, 0, 1, 1, 1};
//        System.out.println(calculateCount(array, 1));
//
//        int[] array2 = {1, 1, 0, 0, 0, 1, 1};
//        System.out.println(calculateCount(array2, 0));
//        int[] array = {3, 2, 2, 3};
//        shift(array, 2);
//        System.out.println(Arrays.toString(array));
//
//        int[] array2 = {3, 2, 1, 3, 2, 1, 3};
//        shift(array2, 1);
//        System.out.println(Arrays.toString(array2));
    }
//    static String getCommonPrefix(String[] array){
//
//    }

    static void shift(int[] array, int val){
        for (int i = 0; i < array.length; i++){
            if (array[i] == val) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j] != val) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                        break;
                    }
                }
            }
        }
    }



        static int calculateCount(int[] array, int number){
            int count = 0;
            int maxCount = 0;
            for (int a: array){
                if (a ==1){
                    count++;
                }
                else{
                    count = 0;
                }
            }
            if (count > maxCount){
                maxCount = count;
            }
            return maxCount;
        }
    }
