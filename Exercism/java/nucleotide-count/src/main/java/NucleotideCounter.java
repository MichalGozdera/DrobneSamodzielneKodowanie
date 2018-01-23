import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {
    private String s;
    public NucleotideCounter(String s) {
        this.s=s;
    }

    public Integer count(char c) {
        if (!(c=='A'||c=='C'||c=='G'||c=='T'))
                throw new IllegalArgumentException();
        return nucleotideCounts().get(c);
    }

    public Map<Character,Integer> nucleotideCounts() {
        Map <Character,Integer> nucleos=new HashMap<>();
        nucleos.put('A',0);
        nucleos.put('C',0);
        nucleos.put('G',0);
        nucleos.put('T',0);
        for (char c: s.toCharArray()){
            nucleos.put(c,nucleos.get(c)+1);
        }
        return nucleos;
    }
}
