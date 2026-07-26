package leetcode.strings.roman_to_integer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testRomanToInt_SimpleAdditive() {
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    public void testRomanToInt_SubtractivePairs() {
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    public void testRomanToInt_SingleCharacter() {
        assertEquals(10, solution.romanToInt("X"));
        assertEquals(1000, solution.romanToInt("M"));
    }
}