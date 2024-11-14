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


    /**
     * 杨辉三角获取指定行数据
     *
     * @param rowIndex 行索引
     * @return 指定行数据
     */
    public List<Integer> getRows(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            res = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    res.add(1);
                    continue;
                }
                int val = pre.get(j - 1) + pre.get(j);
                res.add(val);
            }
            pre = res;
        }
        return res;
    }

    /**
     * 倒着计算进行优化
     */
    public List<Integer> getRowsUp(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            //数据初始化
            res.add(0);
            for (int j = i; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }
        return res;
    }
}
