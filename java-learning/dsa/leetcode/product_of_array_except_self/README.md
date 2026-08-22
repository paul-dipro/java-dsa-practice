# 238. Product of Array Except Self

### [LeetCode Link](https://leetcode.com/problems/product-of-array-except-self/)

## The Core Idea
The problem demands calculating the product of all elements except `nums[i]` **without using division** in $O(N)$ time complexity.

The product of all elements except `nums[i]` is equivalent to:
$$\text{Prefix Product (all elements to the left of } i) \times \text{Suffix Product (all elements to the right of } i)$$

Instead of allocating two separate prefix and suffix arrays (which would consume $O(N)$ space), we populate prefix products directly into the `result` array during the first pass, and multiply suffix products on-the-fly during a reverse second pass.

## My Approach
1. **Initialize Output:** Create the `result` array of length $N$.
2. **Pass 1 (Prefix Computation):** Loop left-to-right maintaining a running `product`. Store the prefix product accumulated so far at index `i`, then multiply `product` by `nums[i]`.
3. **Pass 2 (Suffix Multiplication):** Reset `product = 1`. Loop right-to-left. Multiply `result[i]` by `product` (which holds the suffix product for index `i`), then multiply `product` by `nums[i]`.

## Complexity
* **Time:** $O(N)$ — Exactly two sequential passes through the array.
* **Space:** $O(1)$ Auxiliary — Modifies and returns the mandatory output array without allocating extra heap structures.