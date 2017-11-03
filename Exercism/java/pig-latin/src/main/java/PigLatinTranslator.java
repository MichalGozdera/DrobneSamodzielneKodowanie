import java.util.regex.Pattern;

public class PigLatinTranslator {

    public String translate(String englishPhrase) {
        if (englishPhrase.matches(".*\\s.*")){
            String[]words=englishPhrase.split("\\s");
            StringBuilder sb=new StringBuilder();
            for (String s:words){
                sb.append(translate(s)+" ");

            }
            sb.deleteCharAt(sb.length()-1);
            return sb.toString();
        }
        String temp = englishPhrase.toUpperCase();
        Pattern pattern = Pattern.compile("^SCH.*|^THR.*|^.{1}QU.*");
        if (pattern.matcher(temp).matches()) {
            return new String(englishPhrase.substring(3, englishPhrase.length()) + englishPhrase.substring(0, 3) + "ay");
        }
        pattern = Pattern.compile("^CH.*|^TH.*|^QU.*");
        if (pattern.matcher(temp).matches()) {
            return new String(englishPhrase.substring(2, englishPhrase.length()) + englishPhrase.substring(0, 2) + "ay");
        }
        pattern = Pattern.compile("^SCH.*|^THR.*|^.{1}QU.*");
        if (pattern.matcher(temp).matches()) {
            return new String(englishPhrase.substring(3, englishPhrase.length()) + englishPhrase.substring(0, 3) + "ay");
        }
        pattern = Pattern.compile("^XR.*|^YT.*");
        if (pattern.matcher(temp).matches()) {
            return new String(englishPhrase + "ay");
        }
        switch (temp.charAt(0)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'H':
                return new String(englishPhrase + "ay");
            default:
                return new String(englishPhrase.substring(1, englishPhrase.length()) + englishPhrase.charAt(0) + "ay");
        }
    }
}
