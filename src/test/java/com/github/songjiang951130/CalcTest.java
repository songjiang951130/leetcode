package com.github.songjiang951130;

import com.github.songjiang951130.leetcode.base.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    @Test
    public void build() {
        double stockPrice = 5.0;
        double eps = 1.22;
        double buyTotal = 10000;
        double rate = 0.95;
        double fenhongRate = 0.20;
        double roe = 0.13;
        double asset = eps / roe;
        System.out.println("eps: " + eps + ", roe: " + roe + ", 初始净资产: " + asset);
        double stockCount = buyTotal / stockPrice;
        for (int i = 1; i <= 20; i++) {
            stockPrice *= rate;
            double fenhong = eps * fenhongRate;
            stockCount += fenhong * stockCount / stockPrice;
            asset += eps * (1 - fenhongRate);
            System.out.printf("%2d年股价：%.2f 净资产：%.2f  eps：%.2f 每股新增净资产：%.2f  分红：%.2f 持有股数：%.2f 当年分红：%.2f 总市值：%.2f\n",
                    i, stockPrice, asset, eps, eps * (1 - fenhongRate), fenhong, stockCount, stockCount * stockPrice);
            eps = asset * roe;
        }

    }
}