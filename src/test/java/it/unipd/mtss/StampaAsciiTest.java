package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StampaAsciiTest {

    //test per caratteri che non dovrebbero comparire
    @Test(expected = IllegalArgumentException.class)
    public void characterNotPresentInRomanFormat() {
        StampaAscii.printAsciiArt("gg");
        StampaAscii.printAsciiArt("cane");
        StampaAscii.printAsciiArt("fffr");
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

    @Test
    public void TestL() {
        StringBuilder result = new StringBuilder();
            result.append("*       \n");
            result.append("*       \n");
            result.append("*       \n");
            result.append("*       \n");
            result.append("* * * * \n");
            result.append(" \n");
        String stringa= result.toString(); 
            assertEquals(StampaAscii.printAsciiArt("L"), stringa);
    }

    @Test
        public void TestC() {
            StringBuilder result = new StringBuilder();
                result.append("* * * *\n");
                result.append("*      \n");
                result.append("*      \n");
                result.append("*      \n");
                result.append("* * * *\n");
                result.append(" \n");
            String stringa= result.toString(); 
                assertEquals(StampaAscii.printAsciiArt("C"), stringa);
        }

        @Test
        public void TestD() {
            StringBuilder result = new StringBuilder();
                result.append("* * *   \n");
                result.append("*     * \n");
                result.append("*      *\n");
                result.append("*     * \n");
                result.append("* * *   \n");
                result.append(" \n");
            String stringa= result.toString(); 
                assertEquals(StampaAscii.printAsciiArt("D"), stringa);
        }

        @Test
        public void TestM() {
            StringBuilder result = new StringBuilder();
                result.append("*       *\n");
                result.append("* *   * *\n");
                result.append("*  * *  *\n");
                result.append("*   *   *\n");
                result.append("*       *\n");
                result.append(" \n");
            String stringa= result.toString(); 
                assertEquals(StampaAscii.printAsciiArt("M"), stringa);
        }

        @Test
        public void TestMultiChars() {
            StringBuilder result = new StringBuilder();
                result.append("*       *\n");
                result.append("* *   * *\n");
                result.append("*  * *  *\n");
                result.append("*   *   *\n");
                result.append("*       *\n");
                result.append(" \n");
                result.append("* * *   \n");
                result.append("*     * \n");
                result.append("*      *\n");
                result.append("*     * \n");
                result.append("* * *   \n");
                result.append(" \n");
                result.append("* * * *\n");
                result.append("*      \n");
                result.append("*      \n");
                result.append("*      \n");
                result.append("* * * *\n");
                result.append(" \n");
                result.append("*       \n");
                result.append("*       \n");
                result.append("*       \n");
                result.append("*       \n");
                result.append("* * * * \n");
                result.append(" \n");
                result.append("*    * \n");
                result.append(" *  * \n");
                result.append("  *   \n");
                result.append(" *  * \n");
                result.append("*    *\n");
                result.append(" \n");
                result.append("*        *\n");
                result.append(" *      * \n");
                result.append("  *    *  \n");
                result.append("   *  *   \n");
                result.append("     *    \n");
                result.append(" \n");
                result.append("***\n");
                result.append(" * \n");
                result.append(" * \n");
                result.append(" * \n");
                result.append("***\n");
                result.append("\n");

            String stringa= result.toString(); 
                assertEquals(StampaAscii.printAsciiArt("MDCLXVI"), stringa);
        }

        @Test(timeout = 100) 
        public void performance() {
          StampaAscii.printAsciiArt("MDCLXVI");
     }
}