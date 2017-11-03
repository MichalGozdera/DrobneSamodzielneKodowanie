import java.util.ArrayList;
import java.util.List;
public class PrimeCalculator {
    public int nth(int i) {
        if (i<1){
            throw new IllegalArgumentException();
        }
        List<Integer>primes=new ArrayList<>();
        primes.add(2);
        primes.add(3);
        int number=4;
        while (primes.size()<=i){
            number++;
            for (int j:primes){
                if (j*j>number){
                    primes.add(number);
                    break;
                }
                if (number%j==0){
                    break;
                }
            }
        }
        return primes.get(i-1);
    }
}
