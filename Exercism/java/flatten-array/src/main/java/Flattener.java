import java.util.ArrayList;
import java.util.List;

public class Flattener {
    public <T> List<T> flatten(List<T> list) {
        List<T> list1 = new ArrayList<>();
        for (T t : list) {
            if (t instanceof List) {
                list1.addAll(flatten((List<T>) t));
            } else {
                if (t != null) {
                    list1.add(t);
                }
            }
        }
        return list1;
    }
}
