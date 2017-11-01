import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Sieve {
    int maxPrime;
    Sieve(int maxPrime) {
        if (maxPrime>1){
            this.maxPrime=maxPrime;
        }
        //throw new UnsupportedOperationException("Delete this statement and provide your own implementation.");
    }

    List<Integer> getPrimes() {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i < maxPrime; i++) {
            lista.add(i + 1);
        }
        try {
            lista.stream().forEach(numer -> {
                if (numer>Math.sqrt(Collections.max(lista))){
                    throw new RuntimeException();
                }
                List<Integer>zlozone = lista.stream().filter(element -> element % numer != 0 || element == numer).collect(Collectors.toList());
                lista.clear();
                lista.addAll(zlozone);

            });
        } catch (RuntimeException e) {
            return lista;
        }
        return lista;
       // throw new UnsupportedOperationException("Delete this statement and provide your own implementation.");
    }
}
