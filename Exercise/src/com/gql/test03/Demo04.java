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
        int n = in.nextInt();

        int[] student = new int[5];
        // 为每门课程都创建一维数组
        int[] math = new int[n];
        int[] english = new int[n];
        int[] java = new int[n];
        int[] linearAlgebra = new int[n];
        int[] physics = new int[n];

        int courseNumber = 5;
        for (int i = 0; i < courseNumber; i++) {
            for (int j = 0; j < courseNumber; j++) {
                // 输入的成绩既要给student数组还要给学科数组
                int temp = 0;
                switch (j) {
                    case 0:
                        System.out.println("请输入第" + (i + 1) + "位学生的高数成绩：");
                        temp = in.nextInt();
                        math[i] = temp;
                        break;
                    case 1:
                        System.out.println("请输入第" + (i + 1) + "位学生的英语成绩：");
                        temp = in.nextInt();
                        english[i] = temp;
                        break;
                    case 2:
                        System.out.println("请输入第" + (i + 1) + "位学生的Java成绩：");
                        temp = in.nextInt();
                        java[i] = temp;
                        break;
                    case 3:
                        System.out.println("请输入第" + (i + 1) + "位学生的线代成绩：");
                        temp = in.nextInt();
                        linearAlgebra[i] = temp;
                        break;
                    case 4:
                        System.out.println("请输入第" + (i + 1) + "位学生的物理成绩：");
                        temp = in.nextInt();
                        physics[i] = temp;
                        break;
                    default:
                        break;
                }
                student[j] = temp;
            }
            // 计算最高分
            int maxScore = Util.maxArr(student);
            // 计算最低分
            int minScore = Util.minArr(student);
            // 计算平均分
            int aveScore = Util.aveArr(student);
            System.out.println("=======>学生" + (i + 1) + "的最高分为:" + maxScore + ",最低分为:" + minScore + ",平均分为:" + aveScore);
        }
        // 各科目最高分、最低分、平均分
        System.out.println("《数学课程》" + "的最高分为:" + Util.maxArr(math) + ",最低分为:" + Util.minArr(math) + ",平均分为:" + Util.aveArr(math));
        System.out.println("《英语课程》" + "的最高分为:" + Util.maxArr(english) + ",最低分为:" + Util.minArr(english) + ",平均分为:" + Util.aveArr(english));
        System.out.println("《Java课程》" + "的最高分为:" + Util.maxArr(java) + ",最低分为:" + Util.minArr(java) + ",平均分为:" + Util.aveArr(java));
        System.out.println("《线代课程》" + "的最高分为:" + Util.maxArr(linearAlgebra) + ",最低分为:" + Util.minArr(linearAlgebra) + ",平均分为:" + Util.aveArr(linearAlgebra));
        System.out.println("《物理课程》" + "的最高分为:" + Util.maxArr(physics) + ",最低分为:" + Util.minArr(physics) + ",平均分为:" + Util.aveArr(physics));
    }
}
