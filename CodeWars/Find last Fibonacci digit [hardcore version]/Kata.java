/**
 * Just like in the "father" kata, you will have to return the last digit of the nth element in the Fibonacci sequence (starting with 1,1, to be extra clear, not with 0,1 or other numbers).

 You will just get much bigger numbers, so good luck bruteforcing your way through it ;)

 Kata.lastFibDigit(1) == 1
 Kata.lastFibDigit(2) == 1
 Kata.lastFibDigit(3) == 2
 Kata.lastFibDigit(1000) == 5
 Kata.lastFibDigit(1000000) == 5
 */

class Kata {
    static int lastFibDigit(int n) {
        if(n>60){
            return lastFibDigit(n%60);}
        if (n > 10&&n<60) {

            if (n % 2 == 0) {
                int temp1 = lastFibDigit(n / 2 - 1)%10;
                int temp2 = lastFibDigit(n / 2 + 1)%10;
                return (100+temp2 * temp2 - temp1 * temp1)%10;
            } else {
                int temp1 = lastFibDigit((n + 1) / 2)%10;
                int temp2 = lastFibDigit((n + 1) / 2 - 1)%10;
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
            fibo = (fibo1 + fibo2)%10;
            fibo2 = fibo1;
            fibo1 = fibo;
        }
        return fibo;
    }
}