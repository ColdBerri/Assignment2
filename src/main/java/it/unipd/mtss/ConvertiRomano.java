////////////////////////////////////////////////////////////////////
// RICCARDO BERENGAN 2080041
// MICHELE DIOLI 2077629
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import java.util.TreeMap;

public class ConvertiRomano {
  
  // Map che associa i numeri arabi ai corrispondenti numeri romani
  private static final TreeMap<Integer, String> ROMAN_NUMERALS_MAP = new TreeMap<>();
  static {
    ROMAN_NUMERALS_MAP.put(100, "C");
    ROMAN_NUMERALS_MAP.put(90, "XC");
    ROMAN_NUMERALS_MAP.put(50, "L");
    ROMAN_NUMERALS_MAP.put(40, "XL");
    ROMAN_NUMERALS_MAP.put(10, "X");
    ROMAN_NUMERALS_MAP.put(9, "IX");
    ROMAN_NUMERALS_MAP.put(5, "V");
    ROMAN_NUMERALS_MAP.put(4, "IV");
    ROMAN_NUMERALS_MAP.put(1, "I");
  }
  
  public static String convert(int number){

    if (number < 1 || number > 100) {
      throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 100.");
    }
    
    StringBuilder romanNumber = new StringBuilder();
    int floorEntry;
    while (number > 0) {
      floorEntry = ROMAN_NUMERALS_MAP.floorKey(number);
      romanNumber.append(ROMAN_NUMERALS_MAP.get(floorEntry));
      number -= floorEntry;
    }
    
    return romanNumber.toString();
  }
}