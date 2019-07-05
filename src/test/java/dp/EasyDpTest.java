package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class EasyDpTest {
    @Test
    public void rob()
    {
        int[] nums = {1,2,3,1};
        RobType easyDp = new RobType();
        assertEquals(4,easyDp.rob(nums));
        int[] nums2 = {2,7,9,3,1};
        assertEquals(12,easyDp.rob(nums2));
        int[] nums3 = {2,1,1,2};
        assertEquals(4,easyDp.rob(nums3));
        int[] nums4 = {};
        assertEquals(0,easyDp.rob(nums4));

    }
}