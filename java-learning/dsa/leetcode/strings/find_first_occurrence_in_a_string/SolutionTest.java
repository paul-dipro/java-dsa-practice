package leetcode.strings.find_first_occurrence_in_a_string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testStrStr_MatchAtBeginning() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }

    @Test
    public void testStrStr_NoMatch() {
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }

    @Test
    public void testStrStr_MatchAtEnd() {
        assertEquals(4, solution.strStr("abcde", "e"));
    }

    @Test
    public void testStrStr_NeedleLongerThanHaystack() {
        assertEquals(-1, solution.strStr("aaa", "aaaa"));
    }
}