public class CollatzCalculator {
    public int computeStepCount(int i) {
        if (i<1){
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }
        int step=0;
        while (i!=1){
            step++;
            if (i%2==0){
                i/=2;
            }
            else {
                i=i*3+1;
            }
        }
        return step;
    }
}
