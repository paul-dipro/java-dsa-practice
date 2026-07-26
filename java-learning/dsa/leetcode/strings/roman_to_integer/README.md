# 13. Roman to Integer

### [LeetCode Link](https://leetcode.com/problems/roman-to-integer/)

## The Core Idea
Roman numerals are usually written largest to smallest from left to right (e.g., `VI` = $5 + 1 = 6$). However, when a smaller symbol appears before a larger symbol, it represents subtraction (e.g., `IV` = $5 - 1 = 4$).

Instead of handling subtractive pairs (`IV`, `IX`, `XL`, `XC`, `CD`, `CM`) with messy conditional logic, I compare each character's value with the value of the character right after it:
* If `current < next`, the current character is subtractive, so I subtract its value from the total.
* Otherwise, it is additive, so I add its value to the total.

## My Approach
1. **Value Mapping:** I created a helper method `getValue(char)` using a `switch` block for fast $O(1)$ character value resolution.
2. **Linear Scan:** I loop from index `0` up to `s.length() - 2`:
    * Look up `current = getValue(s.charAt(i))` and `next = getValue(s.charAt(i + 1))`.
    * Apply subtractive logic: if `current < next`, `total -= current`, else `total += current`.
3. **Tail Addition:** Since the loop stops before the last character, I unconditionally add `getValue(s.charAt(s.length() - 1))` to `total` at the end.

## Complexity
* **Time:** $O(N)$ — Where $N$ is the length of the string. The string is traversed in a single pass.
* **Space:** $O(1)$ — No extra data structures are allocated. Memory usage is completely flat.