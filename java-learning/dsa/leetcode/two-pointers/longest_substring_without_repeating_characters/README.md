# 3. Longest Substring Without Repeating Characters

### [LeetCode Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## The Core Idea
To find the longest substring without duplicate characters, we maintain a **sliding window** bounded by pointers `left` and `i` (the current right boundary).

We use a `HashMap<Character, Integer>` to track characters currently active inside our sliding window along with their latest indices. When a duplicate character enters the right bound `i`, we shrink the window from `left` by evicting entries from the HashMap until the duplicate condition is resolved.

## My Approach
1. **Window State Tracking:** Use a `HashMap<Character, Integer>` to track characters present in the window `[left, i]`.
2. **Expand Right Bound:** Iterate index `i` through the string from `0` to `s.length() - 1`.
3. **Handle Duplicates:** If `charMap.containsKey(ch)` is true, repeatedly remove `s.charAt(left)` from the map and increment `left` until the duplicate is eliminated from the active window.
4. **Update Max Length:** Calculate `currentLength = i - left + 1`, update `maxLength` if larger, and store the current character and its index `charMap.put(ch, i)`.

## Complexity
* **Time:** $O(N)$ — Every character is inserted into the map once and removed at most once. Both `left` and `i` move forward sequentially.
* **Space:** $O(\min(N, M))$ — Bounded by the string length $N$ and the character set size $M$ (e.g., $128$ for standard ASCII).