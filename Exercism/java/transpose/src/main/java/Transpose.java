public class Transpose {
    public String transpose(String input) {
        if (input.length()==0){
            return "";
        }
        String[]verses=input.split("\n");
        int max=0;
        for (int i = 0; i < verses.length; i++) {
            if (verses[i].length()>max){
                max=verses[i].length();
            }
        }
        StringBuilder sb= new StringBuilder();
        for (int i=0; i<max;i++){
            for (int j=0;j<verses.length;j++){
                if(verses[j].length()<=i){
                    sb.append(" ");
                }
                else {
                    sb.append(verses[j].charAt(i));
                }
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
