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

    //Tests fino a 20
    @Test
    public void First20NumbersConversion() {
        assertEquals(ConvertiRomano.convert(12), "XII");
        assertEquals(ConvertiRomano.convert(17), "XVII");
        assertEquals(ConvertiRomano.convert(20), "XX");
    }

    //Tests fino a 50
    @Test
    public void First50NumbersConversion() {
        assertEquals(ConvertiRomano.convert(25), "XXV");
        assertEquals(ConvertiRomano.convert(30), "XXX");
        assertEquals(ConvertiRomano.convert(43), "XLIII");
    }

    //Tests fino a 50
    @Test
    public void First100NumbersConversion() {
        assertEquals(ConvertiRomano.convert(66), "LXVI");
        assertEquals(ConvertiRomano.convert(80), "LXXX");
        assertEquals(ConvertiRomano.convert(99), "XCIX");
    }

    //numeri con una sola lettera fino a 100
    @Test
    public void OneLetterNumbers() {
        assertEquals(ConvertiRomano.convert(10), "X");
        assertEquals(ConvertiRomano.convert(50), "L");
        assertEquals(ConvertiRomano.convert(100), "C");
    }
}