/**
 * Create an endless stream of prime numbers - a bit like IntStream.of(2,3,5,7,11,13,17), but infinite. The stream must be able to produce a million primes in a few seconds.
 */

import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Primes {
    public static IntStream stream() {
        boolean[] primes = new boolean[100000000 + 1];
        for (int i = 2; i <= Math.sqrt(100000000); i++) {
            if (primes[i] == true) {
                continue;
            }
            for (int j = i + i; j <= 100000000; j += i) {
                if (primes[j]) {
                    continue;
                }
                primes[j] = true;

            }
        }
        List<Integer> lista=new ArrayList<>();
        for (int i = 2; i < primes.length; i++) {
            if (!primes[i]) {
                lista.add(i);
            }
        }
        return lista.stream().mapToInt(Integer::intValue);
    }
}