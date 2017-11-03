public class PhoneNumber {
    String s;

    public PhoneNumber(String s) {
        if (s.matches(".*[^\\d\\.\\s()-].*")) {
            throw new IllegalArgumentException("Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.");
        }
        s = s.replaceAll("\\D", "");
        if (s.length() > 11 || s.length() < 10) {
            throw new IllegalArgumentException("Number must be 10 or 11 digits");
        }
        if (s.length() == 11 && s.charAt(0) != '1') {
            throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");
        }
        this.s = s;
    }

    public String getNumber() {
        if (s.length() == 11) {
            s = s.substring(1, 11);
        }
        return s;
    }
}
