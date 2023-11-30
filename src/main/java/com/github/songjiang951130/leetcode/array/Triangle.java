package com.github.songjiang951130.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Triangle {


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                    continue;
                }
                int val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                row.add(val);
            }
            res.add(row);
        }
        return res;
    }


}
