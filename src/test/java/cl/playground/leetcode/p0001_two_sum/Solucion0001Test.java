package cl.playground.leetcode.p0001_two_sum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solucion0001Test {

    private final Solucion0001 solution = new Solucion0001();

    @Test
    void twoSumCaseOne() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    void twoSumCaseTwo() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    void twoSumCaseThree() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }
}