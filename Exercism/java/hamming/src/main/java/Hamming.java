public class Hamming {
    String leftStrand;
    String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (rightStrand.length() != leftStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getHammingDistance() {

        int diff = 0;
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i))
                diff++;
        }
        return diff;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
