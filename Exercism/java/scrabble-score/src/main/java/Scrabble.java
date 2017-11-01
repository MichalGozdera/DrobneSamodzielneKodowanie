class Scrabble {
    String word;

    Scrabble(String word) {
        this.word = word;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getScore() {
        int score=0;
        for (int i=0;i<word.length();i++){
            score+=charScore(word.toUpperCase().charAt(i));
        }
        return score;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int charScore(char c) {
        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'R':
            case 'S':
            case 'T':
                return 1;
            case 'D':
            case 'G':
                return 2;
            case 'B':
            case 'C':
            case 'M':
            case 'P':
                return 3;
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
                return 4;
            case 'K':
                return 5;
            case 'J':
            case 'X':
                return 8;
            case 'Q':
            case 'Z':
                return 10;
        }
        return 0;
    }
}
