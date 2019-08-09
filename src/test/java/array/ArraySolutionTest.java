package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySolutionTest {

    @Test
    public void findMedianSortedArrays() {
        ArraySolution arraySolution = new ArraySolution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(2.0,arraySolution.findMedianSortedArrays(nums1,nums2),0.0);
    }
}