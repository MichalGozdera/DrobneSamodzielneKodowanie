import java.util.Arrays;
import java.util.stream.Collectors;

public class RotationalCipher {
int rotacja;

    public RotationalCipher(int rotacja) {
        this.rotacja = rotacja;
    }

    public String rotate(String a) {
       return a.chars().map(c->{
           if (Character.isLowerCase(c)){
               return (c+rotacja>122)?c-26+rotacja:c+rotacja;
           }
           else if (Character.isUpperCase(c)){
               return (c+rotacja>90)?c-26+rotacja:c+rotacja;
           }
           else return c;
       }).mapToObj(c->(char)c).map(c->c.toString()).collect(Collectors.joining(""));
    }

}
