# 283. Move Zeroes

### [LeetCode Link](https://leetcode.com/problems/move-zeroes/)

## The Core Idea
The problem requires us to move all `0`s to the end of the array while maintaining the relative order of non-zero elements—completely **in-place** ($O(1)$ auxiliary memory).

Instead of doing costly swaps every time a zero is encountered, I used a **write pointer (`k`)**. I iterate through the array, copy every non-zero element to index `k`, and increment `k`. Once all non-zero elements are placed at the front, I fill indices from `k` to the end with zeroes.

## My Approach
1. **Track Non-Zero Positions:** I maintain a pointer `k = 0` representing the index where the next non-zero element should go.
2. **First Pass (Shift Non-Zeroes):** Iterate through the array with pointer `i`. Whenever `nums[i] != 0`, I set `nums[k] = nums[i]` and advance `k`.
3. **Second Pass (Zero Fill):** From index `k` to `nums.length - 1`, I set every element to `0`.

## Complexity
* **Time:** $O(N)$ — I traverse the array in two linear passes, performing at most $N$ reads and $N$ writes.
* **Space:** $O(1)$ — Operations are done strictly in-place on the original array.
