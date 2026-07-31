package leetcode.sliding_window.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (charMap.containsKey(ch)) {
                charMap.remove(s.charAt(left));
                left++;
            }

            int currentLength = i - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }

            charMap.put(ch, i);
        }

        return maxLength;
    }
}