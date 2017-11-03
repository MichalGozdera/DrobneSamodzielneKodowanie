import java.util.ArrayList;
import java.util.List;

public class IsogramChecker {
    public boolean isIsogram(String s) {
        List<Integer> codepoints = new ArrayList<>();
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (codepoints.contains(s.codePointAt(i))&&Character.isLetter(s.codePointAt(i))){
                return false;
            }else {
                codepoints.add(s.codePointAt(i));
            }
        }
        return true;
    }
}
