package leetcode.two_pointers.move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {

        int k = 0;
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                nums[k] = nums[i];
                k++;
            }
        }

        for (int j = k; j < nums.length; j++) {
            nums[j] = target;
        }
    }
}