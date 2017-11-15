/**
 * x Simple, given a string of words, return the length of the shortest word(s).

 String will never be empty and you do not need to account for different data types.
 */

import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        int min=s.length();
        String[]words=s.split("\\s");
        for (String word :words){
            if (word.length()<min){
                min=word.length();
            }
        }
        return min;
    }
}