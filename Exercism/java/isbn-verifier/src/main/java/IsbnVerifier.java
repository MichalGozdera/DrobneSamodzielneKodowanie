import java.util.regex.Pattern;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        if (!Pattern.matches("[0-9-]*[Xx]?$", stringToVerify)) {
            return false;
        }
        stringToVerify = stringToVerify.replaceAll("-", "");
        System.out.println(stringToVerify);
        if (stringToVerify.length() > 11) {
            return false;
        }
        int total = 0;
        System.out.println(stringToVerify.length());
        int index = 0;
        while (Character.isDigit(stringToVerify.charAt(index)) && index < stringToVerify.length() - 1) {
            total += Integer.parseInt(stringToVerify.substring(index, index + 1)) * (10 - index);
            index++;
        }
        if(stringToVerify.toLowerCase().charAt(index)=='x'){
            total+=10;
        }
        else {
            total += Integer.parseInt(stringToVerify.substring(index, index + 1)) * (10 - index);
        }
        return total%11==0;
    }

}
