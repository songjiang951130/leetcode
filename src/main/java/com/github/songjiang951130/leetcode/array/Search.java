package com.github.songjiang951130.leetcode.array;

public class Search {
    /**
     * 旋转数组搜索
     *
     * @param nums
     * @param target
     * @return
     * @link <link>https://leetcode-cn.com/problems/search-in-rotated-sorted-array/</link>
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        /**
         * 旋转之后的数据，在第一次二分的时候。一段是有序的，一端是无序的
         *
         */
        while (left <= right) {
            // >>1
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                //此处是乱序的，又会回到问题本身
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return -1;
    }
}
