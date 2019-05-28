package dp;

import org.junit.Test;
import stack.Leetcode1021;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution solution;
    public SolutionTest() {
        this.solution = new Solution();
    }

    @Test
    public void testCase1() {
        int[] array ={-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6,solution.maxSubArray(array));
    }
    @Test
    public void testClimbStairs() {
        assertEquals(1,solution.climbStairs(1));
        assertEquals(2,solution.climbStairs(2));
        assertEquals(3,solution.climbStairs(3));
    }
}
