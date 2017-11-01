public class DifferenceOfSquaresCalculator{

    public int computeSquareOfSumTo(int i) {
        int n=0;
        for (int j=0;j<=i;j++){
            n+=j;
        }
            return n*n;
    }

    public int computeDifferenceOfSquares(int i) {
return computeSquareOfSumTo(i)-computeSumOfSquaresTo(i);
    }

    public int computeSumOfSquaresTo(int i) {
        int n=0;
        for (int j=0;j<=i;j++){
            n+=j*j;
        }
        return n;
    }
}