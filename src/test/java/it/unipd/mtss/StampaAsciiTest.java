package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StampaAsciiTest {

    //test per caratteri che non dovrebbero comparire
    @Test(expected = IllegalArgumentException.class)
    public void characterNotPresentInRomanFormat() {
        StampaAscii.printAsciiArt("W");
        StampaAscii.printAsciiArt("lol");
        StampaAscii.printAsciiArt("b");
        StampaAscii.printAsciiArt(null);
    }

    //test lettera I
    @Test
    public void TestI() {
        StringBuilder result = new StringBuilder();
            result.append("***\n");
            result.append(" * \n");
            result.append(" * \n");
            result.append(" * \n");
            result.append("***\n");
            result.append("\n");
        String stringa= result.toString(); 
            assertEquals(StampaAscii.printAsciiArt("I"), stringa);
    }

    @Test
    public void TestV() {
        StringBuilder result = new StringBuilder();
            result.append("*        *\n");
            result.append(" *      * \n");
            result.append("  *    *  \n");
            result.append("   *  *   \n");
            result.append("     *    \n");
            result.append(" \n");
        String stringa= result.toString(); 
            assertEquals(StampaAscii.printAsciiArt("V"), stringa);
    }

    @Test
    public void TestX() {
        StringBuilder result = new StringBuilder();
            result.append("*    * \n");
            result.append(" *  * \n");
            result.append("  *   \n");
            result.append(" *  * \n");
            result.append("*    *\n");
            result.append(" \n");
        String stringa= result.toString(); 
            assertEquals(StampaAscii.printAsciiArt("X"), stringa);
    }
}