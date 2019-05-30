package dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution solution;

    public SolutionTest() {
        this.solution = new Solution();
    }

    @Test
    public void testCase1() {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, solution.maxSubArray(array));
        assertEquals(6, solution.maxSubArrayByForce(array));
        assertEquals(6, solution.maxSubArrayLowMemory(array));
    }

    @Test
    public void testClimbStairs() {
        assertEquals(1, solution.climbStairs(1));
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    public void testFib() {
        assertEquals(0, solution.fib(0));
        assertEquals(1, solution.fib(1));
        assertEquals(1, solution.fib(2));
        assertEquals(2, solution.fib(3));
        assertEquals(3, solution.fib(4));
    }

    @Test
    public void testMaxProfit() {
        int[] case1 = {7, 1, 5, 3, 6, 4};
        // int 0 -6 4 -2 3 -2
        assertEquals(5, solution.maxProfit(case1));
        int[] case2 = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(case2));
        //[1,2]
        int[] case3 = {1, 2};
        assertEquals(1, solution.maxProfit(case3));
        int[] case4 = {};
        assertEquals(0, solution.maxProfit(case4));
    }
    @Test
    public void testMaxProfitForce(){
        int[] case1 = {7, 1, 5, 3, 6, 4};
        // int 0 -6 4 -2 3 -2
        assertEquals(5, solution.maxProfitForce(case1));
        int[] case2 = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfitForce(case2));
        //[1,2]
        int[] case3 = {1, 2};
        assertEquals(1, solution.maxProfitForce(case3));
        int[] case4 = {};
        assertEquals(0, solution.maxProfitForce(case4));
    }
}
