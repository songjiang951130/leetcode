package water;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode766Test {
    private Leetcode766 leetcode;

    public Leetcode766Test() {
        this.leetcode = new Leetcode766();
    }

    @Test
    public void isToeplitzMatrix() {
        int[][] case1 = {{
                36, 59, 71, 15, 26, 82, 87
        }, {
                56, 36, 59, 71, 15, 26, 82
        }, {
                15, 0, 36, 59, 71, 15, 26
        }};
        Assert.assertFalse(leetcode.isToeplitzMatrix(case1));

        int[][] case2 = {{
                36, 59, 71
        }, {
                56, 36, 59
        }, {
                15, 56, 36,
        }};
        Assert.assertTrue(leetcode.isToeplitzMatrix(case2));
    }
}