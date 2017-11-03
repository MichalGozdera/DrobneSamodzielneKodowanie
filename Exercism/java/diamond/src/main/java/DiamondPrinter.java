import java.util.ArrayList;
import java.util.List;

public class DiamondPrinter {
    public List<String> printToList(char a) {
        List<String> verses = new ArrayList<>();
        int height = a - 64; //wysokość diamentu do połowy Od znaku (wielkiej litery) odejmuje 64 (65 to już duże A wg ASCII)
        for (int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder(height * 2 - 1); //długość wiersza całkowita - niepołowiczna
            for (int j = 0; j < (height * 2 - 1); j++) { //iteracja po wierszu - wstawianie kolejnych spacji albo liter
                int index = a - i - 65; //miejsce, gdzie pojawi się kolejna litera w kolejnym wierszu
                int index2 = height * 2 - 1 - index - 1; //lustrzane odbicie tego co powyżej by była symetria
                if (j == index || j == index2) {
                    sb.append((char) (65 + i)); //wstawianie kolejnej litery zaczynając od 'A'
                } else {
                    sb.append(" ");
                }
            }
            verses.add(sb.toString());
        }
        for (int i = verses.size() - 1; i > 0; i--) { //budowanie dolnej połowy
            verses.add(verses.get(i - 1));
        }
        return verses;
    }
}
