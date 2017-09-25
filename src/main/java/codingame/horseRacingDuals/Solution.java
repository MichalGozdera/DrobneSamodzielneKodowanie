package codingame.horseRacingDuals;
/*
	The Goal

Casablanca’s hippodrome is organizing a new type of horse racing: duals. During a dual, only two horses will participate in the race. In order for the race to be interesting, it is necessary to try to select two horses with similar strength.

Write a program which, using a given number of strengths, identifies the two closest strengths and shows their difference with an integer (? 0).
 	Game Input

Input
Line 1: Number N of horses

The N following lines: the strength Pi of each horse. Pi is an integer.

Output
The difference D between the two closest strengths. D is an integer greater than or equal to 0.
Constraints
1 < N  < 100000
0 < Pi ? 10000000
Example
Input
3
5
8
9
Output

 */
import java.util.*;


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[]horses=new int[N];
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            horses[i]=pi;

        }
        Arrays.sort(horses);
        int dif=10000000;
        for (int i = 1; i < N; i++) {
            if((horses[i]-horses[i-1])<dif)
                dif=horses[i]-horses[i-1];

        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(dif);
    }
}