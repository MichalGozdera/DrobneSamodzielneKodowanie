class ReverseString {
  
    String reverse(String stringToReverse) {
        StringBuilder sb=new StringBuilder(stringToReverse);
        return sb.reverse().toString();
    }
  
}