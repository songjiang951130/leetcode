package com.github.songjiang951130.leetcode.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Job {
    /**
     * case 1 3 2 5 3 2 2+（3+2）= 7 2 1 7+1 = 8
     *
     * @param jobs
     * @return
     */

    public int handle(int[][] jobs) {
        List<PriorityJob> list = new ArrayList<>();
        for (int i = 0; i < jobs.length; i++) {
            int[] temp = jobs[i];
            list.add(new PriorityJob(temp[0], temp[1]));
        }
        // 排序使执行时间长的在前面
        Collections.sort(list);
        int result = 0;
        int wait = 0;
        for (int i = 0; i < jobs.length; i++) {
            PriorityJob pj = list.get(i);
            wait += pj.r;
            result = Math.max(result, wait + pj.c);
        }
        return result;
    }

    private class PriorityJob implements Comparable<PriorityJob> {
        int r, c; // r 到达时间，c 执行时间

        public PriorityJob(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public int compareTo(PriorityJob o) {
            return o.c > c ? 1 : -1;
        }
    }

    /**
     * https://leetcode.cn/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150
     *
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int start = i;
            int times = 0;
            int gasSum = 0;
            int cosSum = 0;
            while (times < gas.length) {
                int idx = (start + times) % gas.length;
                gasSum += gas[idx];
                cosSum += cost[idx];
                if (gasSum < cosSum) {
                    break;
                }
                times++;
            }
            if (times == gas.length) {
                return start;
            } else {
                return start + times + 1;
            }
        }
        return -1;
    }


    public int maxDistance(List<List<Integer>> arrays) {
        return 0;
    }
}
