/**
 * This is a demo task.

 Write a function:

 class Solution { public int solution(int[] A); }
 that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

 For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

 Given A = [1, 2, 3], the function should return 4.

 Given A = [−1, −3], the function should return 1.

 Assume that:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [−1,000,000..1,000,000].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.
 */
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        if (A[A.length-1]<1){
            return 1;}
        boolean[] marked=new boolean[A[A.length-1]+2];
        for(int i=0;i<A.length;i++){
            if (A[i]>-1){
                marked[A[i]]=true;
            }
        }
        for(int i=1;i<marked.length;i++){
            if (!marked[i]){
                return i;}
        }
        return 0;
    }
}