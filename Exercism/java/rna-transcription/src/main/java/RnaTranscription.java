class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder(dnaStrand);
        for (int i=0;i<sb.length();i++) {
            char c=sb.charAt(i);
            if (c == 'C')
                sb.replace(i,i+1,"G");
            else if (c == 'G')
                sb.replace(i,i+1,"C");
            else if (c == 'T')
                sb.replace(i,i+1,"A");
            else if (c == 'A')
                sb.replace(i,i+1,"U");
            else
                throw  new IllegalArgumentException("Invalid input");
        }
        return sb.toString();
    }

}
