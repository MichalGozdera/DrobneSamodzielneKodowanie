class TwelveDays {
    String verse(int verseNumber) {
        String[] wiersze = {
            "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
        } ;
        String[] prezenty = {
            "a Partridge in a Pear Tree.", "two Turtle Doves, ", "three French Hens, ",
                    "four Calling Birds, ", "five Gold Rings, ", "six Geese-a-Laying, ", "seven Swans-a-Swimming, ",
                    "eight Maids-a-Milking, ", "nine Ladies Dancing, ", "ten Lords-a-Leaping, ", "eleven Pipers Piping, ", "twelve Drummers Drumming, "
        } ;
        String start="On the ";
        String middle=" day of Christmas my true love gave to me, ";
        StringBuilder sb = new StringBuilder();
        sb.append(start).append(wiersze[verseNumber-1]).append(middle);
        for (int i=verseNumber-1;i>=0;i--){
            if (verseNumber>1&&i==0){
                sb.append("and ");
            }
            sb.append(prezenty[i]);
        }
        sb.append("\n");
        return sb.toString();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb=new StringBuilder();
        for (int i=startVerse;i<=endVerse;i++){
            sb.append(verse(i)).append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String sing() {
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<=12;i++){
            sb.append(verse(i)).append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
