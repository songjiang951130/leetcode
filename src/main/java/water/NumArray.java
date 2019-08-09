package water;

/**
 * @// TODO: 2019-08-09 用线段树进行优化
 */
public class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;

    }

    public void update(int i, int val) {
        nums[i] = val;
    }

    public int sumRange(int start, int end) {
        int sum = 0;
        for (int index = start; index <= end; index++) {
            sum += nums[index];
        }
        return sum;

    }
}