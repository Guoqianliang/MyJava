package com.gql.test05;

import java.util.StringJoiner;

/**
 * @Description: 请设计一个学生类Student，并进行测试
 * （1）类中包含姓名、成绩两个属性
 * （2）分别对这两个属性定义两个方法，一个用于值的设置，另一个用于获取值
 * （3）在类中定义一个无参的构造方法和一个包含两个参数的构造方法，两个参数分别用于给姓名和成绩赋值
 * （4）在另一个测试类中创建两个Student对象，一个使用无参的构造方法，然后调用方法给姓名和成绩赋值，另一个使用有参的构造方法，在构造方法中给姓名和成绩赋值。
 * @author Guoqianliang
 * @date 17:58 - 2021/3/14
 */
public class Demo03 {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setName("小花");
        student01.setScore(99);

        Student student02 = new Student("小红", 59);

        System.out.println(student01);
        System.out.println(student02);
    }
}

class Student {
    private String name;
    private Integer score;

    public Student() {
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("score=" + score)
                .toString();
    }
}

