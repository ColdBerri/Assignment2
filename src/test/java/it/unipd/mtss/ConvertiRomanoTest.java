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

    //primi 6 numeri continuo
    @Test
    public void First6NumbersConversion() {
        assertEquals(ConvertiRomano.convert(4), "IV");
        assertEquals(ConvertiRomano.convert(5), "V");
        assertEquals(ConvertiRomano.convert(6), "VI");
    }

    //primi 9 numeri continuo    
    @Test
    public void First9NumbersConversion() {
        assertEquals(ConvertiRomano.convert(7), "VII");
        assertEquals(ConvertiRomano.convert(8), "VIII");
        assertEquals(ConvertiRomano.convert(9), "IX");
    }

    @Test
    public void First20NumbersConversion() {
        assertEquals(ConvertiRomano.convert(12), "XII");
        assertEquals(ConvertiRomano.convert(17), "XVII");
        assertEquals(ConvertiRomano.convert(20), "XX");
    }

    //numeri con una sola lettera fino a 10
    @Test
    public void OneLetterNumbers() {
        assertEquals(ConvertiRomano.convert(10), "X");
    }
}