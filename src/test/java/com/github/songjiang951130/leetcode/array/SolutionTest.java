package com.github.songjiang951130.leetcode.array;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testArray() {
        Assert.assertEquals(4, solution.removeDuplicates(new int[]{1, 2, 3, 4}));
        Assert.assertEquals(2, solution.removeDuplicates(new int[]{1, 2, 2}));
        Assert.assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    public void testThreeSum() {
        List<List<Integer>> res1 = Lists.newArrayList(
                Lists.newArrayList(-1, -1, 2),
                Lists.newArrayList(-1, 0, 1)
        );
        Assert.assertEquals(res1,
                solution.threeSum(new int[]{0, 1, -1, -1, 2, -1, -4}));

        List<List<Integer>> res2 = Lists.newArrayList(
                Lists.newArrayList(-2, 0, 2),
                Lists.newArrayList(-2, 1, 1)
        );
        Assert.assertEquals(res2,
                solution.threeSum(new int[]{-2, 0, 1, 1, 2}));

        List<List<Integer>> res3 = Lists.newArrayList();
        res3.add(Lists.newArrayList(-2, 0, 2));
        Assert.assertEquals(res3,
                solution.threeSum(new int[]{-2, 0, 0, 2, 2}));


    }

    @Test(timeout = 1000L)
    public void testMaxAbsoluteSum() throws IOException {
        Assert.assertEquals(5, solution.maxAbsoluteSum(new int[]{1, -3, 2, 3, -4}));
        Assert.assertEquals(8, solution.maxAbsoluteSum(new int[]{2, -5, 1, -4, 3, -2}));
        int[] nums = getNums();
        Assert.assertEquals(1881218, solution.maxAbsoluteSum(nums));
    }

    private static int[] getNums() throws IOException {
        File file = new File("src/test/resources/long_array.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int fileSize = fileInputStream.available();
            byte[] data = new byte[fileSize];
            fileInputStream.read(data);
            String content = new String(data);
            String[] split = content.split(",");
            int[] nums = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                nums[i] = Integer.parseInt(split[i]);
            }
            return nums;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new int[]{};
    }
}
