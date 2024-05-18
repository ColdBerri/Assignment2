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
    ROMAN_NUMERALS_MAP.put(1, "I");
  }
  
  public static String convert(int number){
    if (number < 1 || number > 3) {
      throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 3.");
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