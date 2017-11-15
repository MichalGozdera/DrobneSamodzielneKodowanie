// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int right=0;
        int diff=0;
        int left=0;
        int result=0;
        for (int i : A){
            right+=i;
            result+=Math.abs(i);
            }
            
            for (int i=0; i<A.length-1;i++){
                left+=A[i];
                right-=A[i];               
                diff=Math.abs(left-right);
                if (diff==0){
                return 0;
                }
                if (diff<result){
                    result=diff;
                    }
                                    }
                return result;
        // write your code in Java SE 8
    }
}