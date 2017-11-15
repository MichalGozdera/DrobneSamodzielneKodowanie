/**
 * As you probably know, Fibonacci sequence are the numbers in the following integer sequence: 1, 1, 2, 3, 5, 8, 13... Write a method that takes the index as an argument and returns last digit from fibonacci number. Example: getLastDigit(15) - 610. Your method must return 0 because the last digit of 610 is 0. Fibonacci sequence grows very fast and value can take very big numbers (bigger than integer type can contain), so, please, be careful with overflow.

 Hardcore version of this kata, no bruteforce will work here ;)
 */

public class Fibonacci {
    public static int getFibNumb(int n) {
        if(n>100000){
            System.out.println(n);}
        if (n > 10) {

            if (n % 2 == 0) {
                int temp1 = getFibNumb(n / 2 - 1)%10;
                int temp2 = getFibNumb(n / 2 + 1)%10;
                return (100+temp2 * temp2 - temp1 * temp1)%10;
            } else {
                int temp1 = getFibNumb((n + 1) / 2)%10;
                int temp2 = getFibNumb((n + 1) / 2 - 1)%10;
                return (temp2 * temp2 + temp1 * temp1)%10;
            }
        }
        int fibo2 = 0;
        int fibo1 = 1;
        int fibo = 0;
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            fibo = fibo1 + fibo2;
            fibo2 = fibo1;
            fibo1 = fibo;
        }
        return fibo % 10;
    }
}