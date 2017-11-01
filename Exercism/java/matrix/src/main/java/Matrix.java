import java.util.Arrays;

class Matrix {
int[][]tablica;
    Matrix(String matrixAsString) {
        String[]temp=matrixAsString.split("\\n");
        tablica=new int[temp.length][];
        for (int i=0; i<temp.length;i++){
            String[]cyfry=temp[i].split("\\s");
            tablica[i]=new int[cyfry.length];
            for (int j=0;j<cyfry.length;j++){
                tablica[i][j]=Integer.parseInt(cyfry[j]);
            }
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getRow(int rowNumber) {
        return tablica[rowNumber];
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getColumn(int columnNumber) {
        int[]kolumna=new int[getRowsCount()];
        for (int i=0;i<kolumna.length;i++){
            kolumna[i]=tablica[i][columnNumber];
        }
        return kolumna;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getRowsCount() {
        return tablica.length;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getColumnsCount() {
        int max=0;
        for (int i=0;i<getRowsCount();i++){
            if (tablica[i].length>max){
                max=tablica[i].length;
            }
        }
        return max;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
