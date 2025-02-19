package com.github.songjiang951130.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class huawei2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        List<Integer> list = new ArrayList<>();
        Integer target = 0;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                String s = in.nextLine();
                String[] s1 = s.split(",");
                for (String sr : s1) {
                    list.add(Integer.parseInt(sr));
                }
            } else {
                target = in.nextInt();
            }
        }

        int res = equalSum(list, target);
        System.out.println(res);
    }

    public static int equalSum(List<Integer> arr, int target) {
        int len = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum > target) {
                    break;
                }
                if (sum == target) {
                    len = Math.max(j - i + 1, len);
                }
            }
        }
        return len == Integer.MIN_VALUE ? -1 : len;
    }
}
