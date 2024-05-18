package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertiRomanoTest {
    //test dei numeri fuori dal range, oltre mille, zero o sotto 1
    @Test(expected = IllegalArgumentException.class)
        public void overRangeThrowsIllegalArgumentException() {
            ConvertiRomano.convert(1111);
        }
    @Test(expected = IllegalArgumentException.class)
        public void underRangeThrowsIllegalArgumentException() {
            ConvertiRomano.convert(0);
        }
    @Test(expected = IllegalArgumentException.class)
        public void underZeroThrowsIllegalArgumentException() {
            ConvertiRomano.convert(-1);
        }

    //test primi 3 numeri
    @Test
    public void First3NumbersConversion() {
        assertEquals(ConvertiRomano.convert(1), "I");
        assertEquals(ConvertiRomano.convert(2), "II");
        assertEquals(ConvertiRomano.convert(3), "III");
    }
}