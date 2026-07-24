# 217. Contains Duplicate

### [LeetCode Link](https://leetcode.com/problems/contains-duplicate/)

## The Core Idea
The brute-force approach requires comparing every element to every other element ($O(N^2)$ time). Sorting the array first takes $O(N \log N)$ time with $O(1)$ space.

To achieve linear $O(N)$ time performance, I used a **HashSet**. A HashSet provides average $O(1)$ constant-time lookups and insertions. By keeping track of elements I've already scanned, I can immediately spot any value I've seen before.

## My Approach
1. **Initialize a HashSet:** I create a `HashSet<Integer>` named `seen` to track unique values.
2. **Iterate and Check:** For every integer `num` in the array:
    * I check if `seen` already contains `num`. If it does, I immediately return `true` because a duplicate exists.
    * If it doesn't, I add `num` to `seen` and continue.
3. **Fallback:** If the loop finishes without finding any duplicate, I return `false`.

## Complexity
* **Time:** $O(N)$ — I process each element in the array at most once, performing $O(1)$ set operations.
* **Space:** $O(N)$ — In the worst-case scenario (all elements are distinct), the `HashSet` holds $N$ integers.