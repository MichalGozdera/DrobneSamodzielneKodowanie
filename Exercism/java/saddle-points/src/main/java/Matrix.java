import java.util.*;

public class Matrix {
    List<List<Integer>> lists;

    public Matrix(List<List<Integer>> lists) {
        this.lists = lists;

    }

    public Set<MatrixCoordinate> getSaddlePoints() {
        int column = 0;
        int row = 0;
        List<Integer> vertical = new ArrayList<>();
        Set<MatrixCoordinate> saddle = new HashSet<>();
        for (List<Integer> list : lists) {
            for (Integer element : list) {
                if (element == Collections.max(list)) {
                    vertical.clear();
                    column = list.indexOf(element);
                    for (List<Integer> lista : lists) {
                        vertical.add(lista.get(column));
                    }
                    if (element == Collections.min(vertical)) {
                        row = lists.indexOf(list);
                        saddle.add(new MatrixCoordinate(row, column));
                        break;
                    }
                }
            }
        }


        return saddle;
    }
}
