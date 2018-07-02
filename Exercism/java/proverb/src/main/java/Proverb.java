class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder sb=new StringBuilder();
       if (words.length==0){
           sb.append("");
       }
          else if(words.length==1){
          sb.append("And all for the want of a "+words[0]+".");
       }
       else {
             for(int i=0;i<words.length-1;i++){
                 sb.append("For want of a ");
                 sb.append(words[i]);
                 sb.append(" the ");
                 sb.append(words[i+1]);
                 sb.append(" was lost.\n");
             }
           sb.append("And all for the want of a "+words[0]+".");
       }
       return sb.toString();
    }

}
