package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class EasyDpTest {
    @Test
    public void rob() {
        int[] nums = {1, 2, 3, 1};
        RobType easyDp = new RobType();
        assertEquals(4, easyDp.rob(nums));
        int[] nums2 = {2, 7, 9, 3, 1};
        assertEquals(12, easyDp.rob(nums2));
        int[] nums3 = {2, 1, 1, 2};
        assertEquals(4, easyDp.rob(nums3));
        int[] nums4 = {};
        assertEquals(0, easyDp.rob(nums4));
    }

    @Test
    public void robCircle() {
        int[] nums = {2, 3, 2};
        RobType easyDp = new RobType();
        assertEquals(3, easyDp.robCircle(nums));
        int[] nums2 = {1, 2, 3, 1};
        assertEquals(4, easyDp.robCircle(nums2));
        int[] nums3 = {0};
        assertEquals(0, easyDp.robCircle(nums3));
        int[] nums5 = {0, 0};
        assertEquals(0, easyDp.robCircle(nums5));
        int[] nums4 = {};
        assertEquals(0, easyDp.robCircle(nums4));
        int[] nums6 = {2, 1, 1, 1};
        assertEquals(3, easyDp.robCircle(nums6));
        int[] nums7 = {1, 7, 9, 2};
        assertEquals(10, easyDp.robCircle(nums7));
    }
}