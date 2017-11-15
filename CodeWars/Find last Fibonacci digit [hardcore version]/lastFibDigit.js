function lastFibDigit(n){
  if(n>60){
   return lastFibDigit(n%60);}
      if (n > 10&&n<60) {
    
            if (n % 2 == 0) {
                var temp1 = lastFibDigit(n / 2 - 1)%10;
                var temp2 = lastFibDigit(n / 2 + 1)%10;
                return (100+temp2 * temp2 - temp1 * temp1)%10;
            } else {
                var temp1 = lastFibDigit((n + 1) / 2)%10;
                var temp2 = lastFibDigit((n + 1) / 2 - 1)%10;
                return (temp2 * temp2 + temp1 * temp1)%10;
            }
        }
        var fibo2 = 0;
        var fibo1 = 1;
        var fibo = 0;
        if (n == 1) {
            return 1;
        }
        for (var i = 1; i < n; i++) {
            fibo = (fibo1 + fibo2)%10;
            fibo2 = fibo1;
            fibo1 = fibo;
        }
        return fibo;
    }