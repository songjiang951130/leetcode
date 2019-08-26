package com.github.songjiang951130.leetcode;

import com.github.songjiang951130.ioc.core.Container;
import com.github.songjiang951130.leetcode.array.ArraySolution;

public class Main {
    public static void main(String[] args) {
        Container.run(Main.class);
        ArraySolution arraySolution = (ArraySolution) Container.getBean("com.github.songjiang951130.leetcode.array.ArraySolution");
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        arraySolution.findMedianSortedArrays(nums1, nums2);
        System.out.println(arraySolution.getTestField());

        String str = "1234";
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(0, 3));
    }

}
