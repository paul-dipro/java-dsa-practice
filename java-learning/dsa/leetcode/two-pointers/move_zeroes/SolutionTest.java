package leetcode.two_pointers.move_zeroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testMoveZeroes_StandardCase() {
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void testMoveZeroes_SingleElementZero() {
        int[] nums = {0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[] {0}, nums);
    }

    @Test
    public void testMoveZeroes_NoZeroes() {
        int[] nums = {1, 2, 3, 4};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[] {1, 2, 3, 4}, nums);
    }

    @Test
    public void testMoveZeroes_AllZeroes() {
        int[] nums = {0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[] {0, 0, 0}, nums);
    }
}
