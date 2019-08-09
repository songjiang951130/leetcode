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
    }
}