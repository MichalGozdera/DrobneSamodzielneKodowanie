public class SpiralMatrixBuilder {
    public int[][] buildMatrixOfSize(int i) {
        int[][] result = new int[i][i];
        int number = 1;
        int inside = 0;
        while (number <= i * i) {
            number = right(result, inside, inside, number, i);
            number = down(result, inside+1, i - inside - 1, number, i);
            number = left(result, i - inside - 1, i - inside - 2, number);
            number = up(result, i - inside - 2, inside, number);
            inside++;
        }
        return result;
    }

    int right(int[][] src, int rowIndex, int colIndex, int beginNr, int i) {
        if (beginNr>i*i){
            return beginNr;
        }
        while (colIndex < i && src[rowIndex][colIndex] == 0) {
            src[rowIndex][colIndex] = beginNr;
            colIndex++;
            beginNr++;
        }
        return beginNr;
    }

    int down(int[][] src, int rowIndex, int colIndex, int beginNr, int i) {
        if (beginNr>i*i){
            return beginNr;
        }
        while (rowIndex < i && src[rowIndex][colIndex] == 0) {
            src[rowIndex][colIndex] = beginNr;
            rowIndex++;
            beginNr++;
        }
        return beginNr;
    }

    int left(int[][] src, int rowIndex, int colIndex, int beginNr) {
        while (colIndex >= 0 && src[rowIndex][colIndex] == 0) {
            src[rowIndex][colIndex] = beginNr;
            colIndex--;
            beginNr++;
        }
        return beginNr;
    }

    int up(int[][] src, int rowIndex, int colIndex, int beginNr) {
        while (rowIndex >= 0 && src[rowIndex][colIndex] == 0) {
            src[rowIndex][colIndex] = beginNr;
            rowIndex--;
            beginNr++;
        }
        return beginNr;
    }
}
