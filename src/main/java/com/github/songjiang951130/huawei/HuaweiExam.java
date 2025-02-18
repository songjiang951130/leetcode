package com.github.songjiang951130.huawei;

import java.util.*;

public class HuaweiExam {


    public static int minClicks(int[][] board) {
        int res = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    dfs(board, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private static void dfs(int[][] board, int x, int y) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) {
            return;
        }
        if (board[x][y] == 0) {
            return;
        }
        board[x][y] = 0;
        //上面一排
        dfs(board, x-1, y-1);
        dfs(board, x-1, y);
        dfs(board, x-1, y+1);
        //点击左右
        dfs(board, x, y-1);
        dfs(board, x, y+1);
        //下面一排
        dfs(board, x+1, y-1);
        dfs(board, x+1, y);
        dfs(board, x+1, y+1);
    }

    /*
     * 求时间段内，能完成的最大任务数
     */
    public static class Task {
        int startTime;
        int endTime;

        Task(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            tasks.add(new Task(s, e));
        }
        HuaweiExam huaweiExam = new HuaweiExam();
        int maxTasks = huaweiExam.getMaxTasks(tasks);
        System.out.println(maxTasks);
    }

    public  int getMaxTasks(List<Task> tasks) {
        Collections.sort(tasks, Comparator.comparingInt(task -> task.endTime));
        int maxTasks = 0;
        int currentTime = Integer.MIN_VALUE;

        for (Task task : tasks) {
            if (task.startTime >= currentTime) {
                maxTasks++;
                currentTime = task.endTime;
            }
        }
        return maxTasks;
    }
}
