package com.github.songjiang951130.hw;

import java.util.HashSet;
import java.util.Scanner;

public class HuaweiTask {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i1 = in.nextInt();
        int[][] task = new int[i1][2];
        for (int i = 0; i < i1; i++) {
            String s = in.nextLine();
            String[] s1 = s.split(" ");
            for (int j = 0; j < s1.length; j++) {
                task[i][j] = Integer.parseInt(s1[i]);
            }
        }
        int res = maxTask(task);
        System.out.println(res);

    }

    public static int maxTask(int[][] array) {
        int res = 0;
        int day = 1;
        HashSet<Integer> used = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int[] taskTime = array[i];
                if (taskTime[0] <= day && day <= taskTime[1] && !used.contains(i)) {
                    res++;
                    day++;
                    used.add(i);
                    break;
                }
            }
        }
        return res;
    }


}
