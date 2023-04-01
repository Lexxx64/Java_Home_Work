package Lesson2;

public class Seminar {
    public static void main(String[] args) {

        System.out.println(compress("aaabbccccdaa")); //a3b2c4da2
        System.out.println(compress("abcdaa")); //abcda2
    }

    /**
     * Напишите метод который сжимает строку
     * aaaabbbcdd -> a4b3cd2
     * abcda -> abcda
     */
    static String compress(String source){
        int count = 1;
        String result = "";
        result += source.charAt(0);
        for (int i = 1; i < source.length(); i++){
            if (source.charAt(i) == source.charAt(i - 1)){
                count++;
            } else {
                if (count != 1){
                    result += count;
                }
                result += source.charAt(i);
                count = 1;
            }
        }
        if (count != 1){
            result += count;
        }
        return result;
    }
}
