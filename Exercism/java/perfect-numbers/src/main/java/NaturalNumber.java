import java.util.ArrayList;
import java.util.List;

class NaturalNumber {


    Classification classification;
    Integer numer;

    public NaturalNumber(Integer numer) {
        if (numer < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.numer = numer;
    }

    public Classification getClassification() {
        if (numer==1){
            return Classification.DEFICIENT;
        }

        List<Integer> dzielniki = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(numer); i++) {
            if (numer % i == 0) {
                dzielniki.add(i);
                dzielniki.add(numer / i);
            }
            if (i == Math.sqrt(numer) && numer % i == 0) {
                dzielniki.remove(dzielniki.size()-1);
            }
        }
        int suma = 1;
        for (int i : dzielniki) {
            suma += i;
        }
        if (suma == numer)
            return Classification.PERFECT;
        else if (suma < numer)
            return Classification.DEFICIENT;
        else
            return Classification.ABUNDANT;
    }

}

