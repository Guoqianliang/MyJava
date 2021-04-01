package com.gql.test03;

import java.util.Scanner;

/**
 * @Description: 某班同学参加了高数、英语、Java语言、线性代数和物理5门课程的考试，假定成绩已经公布，
 * 请编写一个程序，通过键盘录入他们的成绩，并计算输出每位同学的
 * 课程最高分，最低分和平均分，以及每门课程的班级最高分、最低分和平均分。
 * @author Guoqianliang
 * @date 11:23 - 2021/3/14
 */
public class Demo04 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("请输入学生的个数n：");
        // 输入学生的个数n
        int n = in.nextInt();

        // 创建n行5列的二维数组,规定5列依次为高数成绩、英语成绩、Java语言成绩、线性代数成绩、物理成绩
        int[][] arr = new int[n][5];

        // 将n个学生的成绩输入到二维数组arr[n][5]中.
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩:(顺序为：高数👉英语👉Java👉线性代数👉物理)");
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            arr[i][2] = in.nextInt();
            arr[i][3] = in.nextInt();
            arr[i][4] = in.nextInt();
        }
        System.out.println("您所构建的二维数组是：");
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println("学生成绩输入完成！");

        // 将arr[n][5]的数据备份到arr2[n][5]中.
        int[][] arr2 = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr2[i][j] = arr[i][j];
            }
        }

        //下面在arr数组中对学生个人成绩进行分析:
        System.out.println("------各学生成绩分析如下:");
        for (int m = 0; m < n; m++) {
            int sum = 0;
            //对二维数组的一行进行选择排序
            for (int i = 0; i < (5 - 1); i++) {
                for (int j = i + 1; j < 5; j++) {
                    if (arr[m][i] > arr[m][j]) {
                        int temp = arr[m][j];
                        arr[m][j] = arr[m][i];
                        arr[m][i] = temp;
                    }
                }
                sum = sum + arr[m][i];
            }
            sum = sum + arr[m][4];
            System.out.println("第" + (m + 1) + "个学生的最高分是:" + arr[m][4] + ",最低分是:" + arr[m][0] + "平均分是" + sum / 5);
        }

        // 下面在arr2数组中对每个科目的成绩进行分析:
        System.out.println("------各课程成绩分析如下:");
        for (int m = 0; m < 5; m++) {
            int sum = 0;
            //对二维数组的一列进行选择排序
            for (int i = 0; i < arr2.length - 1; i++) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if (arr2[i][m] > arr2[j][m]) {
                        int temp = arr2[j][m];
                        arr2[j][m] = arr2[i][m];
                        arr2[i][m] = temp;
                    }
                }
                sum = sum + arr2[i][m];
            }
            sum = sum + arr2[n - 1][m];
            System.out.println("第" + (m + 1) + "门课程的最高分是:" + arr2[n - 1][m] + ",最低分是" + arr[0][m] + ",平均分是:" + sum / n);
        }
    }
}
