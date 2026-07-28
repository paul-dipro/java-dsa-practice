# 28. Find the Index of the First Occurrence in a String

### [LeetCode Link](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## The Core Idea
To find the starting index of `needle` inside `haystack`, I slide a search window of size `needle.length()` across `haystack`.

Instead of creating substring slices in memory (which creates heap allocations), I use pointer offsets (`i + j`) to perform character comparisons in-place.

## My Approach
1. **Define Search Boundaries:** I loop `i` from `0` up to `haystack.length() - needle.length()`. Searching beyond this threshold is unnecessary because there aren't enough remaining characters to form the needle.
2. **In-Place Comparison:** For each window starting at index `i`, I iterate `j` through the needle. If `haystack.charAt(i + j) != needle.charAt(j)`, I break early to save operations.
3. **Early Return:** If the inner loop finishes without finding a mismatch (`found == true`), I return the starting index `i`.
4. **Fallback:** If all possible window positions are exhausted without a match, I return `-1`.

## Complexity
* **Time:** $O((N - M) \times M)$ — Where $N$ is the length of `haystack` and $M$ is the length of `needle`. In the worst case, every character comparison runs up to length $M$.
* **Space:** $O(1)$ — Performs checks directly on existing string memory without allocating dynamic memory on the JVM heap.