package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestRoman {

	// TC01: Roman = I, Expected result = 1
    @Test
    void testSingleDigit_I() {
        assertEquals(1, new RomanNumerals().convertRomanNumToInt("I"));
    }
    
    // TC02: Roman = IV, Expected result = 4
    @Test
    void testTwoDigit_IV() {
        assertEquals(4, new RomanNumerals().convertRomanNumToInt("IV"));
    }
    // TC03: Roman = VI, Expected result = 6
    @Test
    void testTwoDigit_VI() {
        assertEquals(6, new RomanNumerals().convertRomanNumToInt("VI"));
    }
    // TC04: Roman = II, Expected result = 2
    @Test
    void testTwoDigit_II() {
        assertEquals(2, new RomanNumerals().convertRomanNumToInt("II"));
    }
    // TC05: Roman = III, Expected result = 3
    @Test
    void testMultipleDigit_III() {
        assertEquals(3, new RomanNumerals().convertRomanNumToInt("III"));    
    } 
    // TC06: Roman = XXVI, Expected result = 26
    @Test
    void testMultipleDigit_XXVI() {
        assertEquals(26, new RomanNumerals().convertRomanNumToInt("XXVI"));    
    }
    // TC07: Roman = LXXIV, Expected result = 74
    @Test
    void testMultipleDigit_LXXIV() {
        assertEquals(74, new RomanNumerals().convertRomanNumToInt("LXXIV"));    
    }
    // TC08: Not Roman = J, Expected result = NullPointerException
    @Test
    void testNotARomanNumber_J() {
        assertThrows(NullPointerException.class, () -> {
        	new RomanNumerals().convertRomanNumToInt("J");
        	});
    }
    // TC09: Using wrong repeating digits = VV  Expected result != 10   
    @Test
    void testWrongRepeating_VV() {
        assertNotEquals(10, new RomanNumerals().convertRomanNumToInt("VV"));    
    }
    
    // TC10: Using wrong repeating digits = XXXX , Expected result != 40   
    @Test
    void testMoreThanThreeRepeating_XXXX() {
        assertNotEquals(40, new RomanNumerals().convertRomanNumToInt("XXXX"));    
    }
}
