// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        long suma=0;
        for (int i:A){
            suma+=i;
        }
        return (int)(((long)(A.length)+1)*(A.length+2)/2-suma);
        // write your code in Java SE 8
    }
}