//import java.util.stream.Stream;
//
//import static java.util.Objects.requireNonNull;
//import static java.util.stream.Collectors.joining;
//
//class Acronym {
//
//    private final String acronym;
//
//    Acronym(String phrase) {
//        requireNonNull(phrase);
//        acronym = Stream.of(phrase.split("\\W+"))
//                .filter(s -> !s.isEmpty())
//                .map(s -> s.charAt(0))
//                .map(ch -> ch.toString().toUpperCase())
//                .collect(joining());
//    }
//
//    String get() {
//        return acronym;
//    }
//
//}

class Acronym {
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String get() {
        StringBuilder acronym = new StringBuilder();
        if (isLetter(phrase.codePointAt(0))) {
            acronym.append(phrase.charAt(0));
        }
        for (int i = 1; i < phrase.length(); i++) {
            if (!isLetter(phrase.codePointAt(i-1))&&isLetter(phrase.codePointAt(i))) {
                acronym.append(phrase.charAt(i));
            }
        }
        return acronym.toString().toUpperCase();
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    Boolean isLetter(int c) {
        return Character.isLetterOrDigit(c);
//        if (c > 64 && c < 91 || c > 96 && c < 123) //kody ASCII dla literków
//            return true;
//        else
//            return false;
    }

}
