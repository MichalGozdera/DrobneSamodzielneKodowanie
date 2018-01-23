import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProteinTranslatorTest {

    private ProteinTranslator proteinTranslator;

    @Before
    public void setUp() {
        proteinTranslator = new ProteinTranslator();
    }

    @Test
    public void testMethionineRnaSequence() {
        List<String> expected = Arrays.asList("Methionine");
        assertEquals(expected, proteinTranslator.translate("AUG"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testPhenylalanineRnaSequence1() {
        List<String> expected = Arrays.asList("Phenylalanine");
        assertEquals(expected, proteinTranslator.translate("UUU"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testPhenylalanineRnaSequence2() {
        List<String> expected = Arrays.asList("Phenylalanine");
        assertEquals(expected, proteinTranslator.translate("UUC"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testLeucineRnaSequence1() {
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("UUA"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testLeucineRnaSequence2() {
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("UUG"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testSerineRnaSequence1() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCU"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testSerineRnaSequence2() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCC"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testSerineRnaSequence3() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCA"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testSerineRnaSequence4() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCG"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testTyrosineRnaSequence1() {
        List<String> expected = Arrays.asList("Tyrosine");
        assertEquals(expected, proteinTranslator.translate("UAU"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testTyrosineRnaSequence2() {
        List<String> expected = Arrays.asList("Tyrosine");
        assertEquals(expected, proteinTranslator.translate("UAC"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testCysteineRnaSequence1() {
        List<String> expected = Arrays.asList("Cysteine");
        assertEquals(expected, proteinTranslator.translate("UGU"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testCysteineRnaSequence2() {
        List<String> expected = Arrays.asList("Cysteine");
        assertEquals(expected, proteinTranslator.translate("UGC"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testTryptophanRnaSequence1() {
        List<String> expected = Arrays.asList("Tryptophan");
        assertEquals(expected, proteinTranslator.translate("UGG"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testStopRnaSequence1() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UAA"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testStopRnaSequence2() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UAG"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testStopRnaSequence3() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UGA"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testTranslationOfRnaToProteinList() {
        List<String> expected = Arrays.asList("Methionine","Phenylalanine","Tryptophan");
        assertEquals(expected, proteinTranslator.translate("AUGUUUUGG"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testTranslationStopsIfStopCodonAtBeginning() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UAGUGG"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testTranslationStopsIfStopCodonAtEnd1() {
        List<String> expected = Arrays.asList("Tryptophan");
        assertEquals(expected, proteinTranslator.translate("UGGUAG"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testTranslationStopsIfStopCodonAtEnd2() {
        List<String> expected = Arrays.asList("Methionine", "Phenylalanine");
        assertEquals(expected, proteinTranslator.translate("AUGUUUUAA"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testTranslationStopsIfStopCodonInMiddle1() {
        List<String> expected = Arrays.asList("Tryptophan");
        assertEquals(expected, proteinTranslator.translate("UGGUAGUGG"));
    }

    //@ignore("Remove to run test")
    @Test
    public void testTranslationStopsIfStopCodonInMiddle2() {
        List<String> expected = Arrays.asList("Tryptophan","Cysteine","Tyrosine");
        assertEquals(expected, proteinTranslator.translate("UGGUGUUAUUAAUGGUUU"));
    }

}
