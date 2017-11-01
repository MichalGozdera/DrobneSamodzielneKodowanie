import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class AcronymTest {

    @Test
    public void fromTitleCasedPhrases() {
        final String phrase = "Portable Network Graphics";
        final String expected = "PNG";
        assertEquals(expected, new Acronym(phrase).get());
    }

    //@Ignore("Remove to run test")
    @Test
    public void fromOtherTitleCasedPhrases() {
        final String phrase = "Ąuby on Rails";
        final String expected = "ĄOR";
        assertEquals(expected, new Acronym(phrase).get());
    }

    //@Ignore("Remove to run test")
    @Test
    public void fromPhrasesWithPunctuation() {
        final String phrase = "1 First_In,_First Out";
        final String expected = "FIFO";
        assertEquals(expected, new Acronym(phrase).get());
    }

    //@Ignore("Remove to run test")
    @Test
    public void fromOtherPhrasesWithPunctuation() {
        final String phrase = "_PHP: Hypertext Preprocessor";
        final String expected = "PHP";
        assertEquals(expected, new Acronym(phrase).get());
    }

   // @Ignore("Remove to run test")
    @Test
    public void fromPhrasesWithNonAcronymAllCapsWord() {
        final String phrase = " GNU Image Manipulation Program";
        final String expected = "GIMP";
        assertEquals(expected, new Acronym(phrase).get());
    }

    //@Ignore("Remove to run test")
    @Test
    public void fromPhrasesWithPunctuationAndSentenceCasing() {
        final String phrase = "  Complementary metal-oxide semiconductor";
        final String expected = "CMOS";
        assertEquals(expected, new Acronym(phrase).get());
    }

}
