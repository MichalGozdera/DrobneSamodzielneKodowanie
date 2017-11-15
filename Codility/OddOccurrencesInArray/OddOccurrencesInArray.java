// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int result=0;
        for (int i:A){
            result^=i;
        }
        return result;
        // write your code in Java SE 8
    }
}