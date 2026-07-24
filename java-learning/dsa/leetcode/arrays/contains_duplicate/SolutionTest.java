package leetcode.arrays.contains_duplicate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testContainsDuplicate_HasDuplicate() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicate_AllUnique() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicate_MultipleDuplicates() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicate_EmptyOrSingleElement() {
        assertFalse(solution.containsDuplicate(new int[] {}));
        assertFalse(solution.containsDuplicate(new int[] {1}));
    }
}