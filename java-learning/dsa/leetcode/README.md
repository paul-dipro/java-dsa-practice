# 🧩 LeetCode & Problem Solving Tracker

This repository documents my solutions to LeetCode problems and core algorithmic patterns. Rather than just collecting solved problems, the focus here is on **pattern recognition, trade-off analysis, and writing clean, production-ready Java code**.

Every solution includes a dedicated test suite (JUnit) and an architectural breakdown of time and space complexity.

---

---

## 📂 Solved Problems & Patterns

### 🔑 Hashing
*Key Focus: Trading linear memory $O(N)$ for constant-time $O(1)$ lookups and fast state tracking.*

| # | Problem | Difficulty | Solution | Approach | Time | Space |
|:---|:---|:---:|:---:|:---|:---:|:---:|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | 🟢 Easy | [`Solution.java`](./hashing/two_sum/Solution.java) | One-pass HashMap value-to-index lookup | $O(N)$ | $O(N)$ |
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | 🟢 Easy | [`Solution.java`](./hashing/contains_duplicate/Solution.java) | HashSet check-before-insert pattern | $O(N)$ | $O(N)$ |

---

### 👈👉 Two Pointers & Sliding Window
*Key Focus: Reducing nested $O(N^2)$ iterations down to $O(N)$ linear scans using pointer convergence and sliding bounds.*

| # | Problem | Difficulty | Solution | Approach | Time | Space |
|:---|:---|:---:|:---:|:---|:---:|:---:|
| 28 | [Find First Occurrence](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | 🟢 Easy | [`Solution.java`](./strings/find_first_occurrence_in_a_string/Solution.java) | Offset sliding window comparison | $O(N \cdot M)$ | $O(1)$ |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | 🟢 Easy | [`Solution.java`](./two_pointers/valid_palindrome/Solution.java) | Converging two-pointer filtering non-alphanumeric | $O(N)$ | $O(1)$ |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | 🟢 Easy | [`Solution.java`](./two_pointers/move_zeroes/Solution.java) | Write-pointer index shifting + trailing zero-fill | $O(N)$ | $O(1)$ |
3. Longest Substring Without Repeating Characters

---

### 📜 Strings & Math Parsing
*Key Focus: In-place string traversal, lookahead/lookbehind state checks, and boundary validation.*

| # | Problem | Difficulty | Solution | Approach | Time | Space |
|:---|:---|:---:|:---:|:---|:---:|:---:|
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | 🟢 Easy | [`Solution.java`](./strings/roman_to_integer/Solution.java) | Forward scan with subtractive lookahead condition | $O(N)$ | $O(1)$ |

---

## 🎯 Development & Testing Workflow

Each solved problem contains three core artifacts:
1. **`Solution.java`**: Clean implementation with inline complexity analysis.
2. **`README.md`**: Problem breakdown, trade-offs, and brute-force vs. optimal comparison.
3. **`SolutionTest.java`**: Unit test suite covering standard usage, edge cases, and empty inputs.
