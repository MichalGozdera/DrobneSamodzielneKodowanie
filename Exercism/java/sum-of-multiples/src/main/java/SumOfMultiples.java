import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {
int numer;
int[] set;

    SumOfMultiples(int number, int[] set) {
        this.numer=number;
        this.set=set;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getSum() {
        int suma=0;
        Set<Integer> wielokrotnosci=new HashSet<>();
        for (int i=1;i<numer;i++){
            for (int j=0;j<set.length;j++){
                if (i%set[j]==0)
                    wielokrotnosci.add(i);
            }
        }
        for (int i: wielokrotnosci){
            suma+=i;
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return suma;
    }

}
