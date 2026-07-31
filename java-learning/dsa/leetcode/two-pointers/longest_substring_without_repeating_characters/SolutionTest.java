package leetcode.sliding_window.longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testLengthOfLongestSubstring_StandardCases() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testLengthOfLongestSubstring_EmptyAndSingleChar() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    public void testLengthOfLongestSubstring_SpacesAndSpecialChars() {
        assertEquals(3, solution.lengthOfLongestSubstring("a b c a"));
        assertEquals(5, solution.lengthOfLongestSubstring("tmmzuxt"));
    }
}