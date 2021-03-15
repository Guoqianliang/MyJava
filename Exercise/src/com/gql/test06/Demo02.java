package com.gql.test06;

/**
 * @Description: 设计 一个学生类AbstractStudent和它的一个子类undergraduate,要求如下：
 * （1）AbstractStudent类有name和age属性，一个包含两个参数的构成方法，用于给name和age赋值，一个show方法打印AbstractStudent的信息
 * （2）本科生类undergraduate增加一个degree属性，有一个包含三个参数的构造方法，前两个参数用于给继承的name和age属性赋值，第三个参数给degree专业赋值，一个show方法用于打印undergraduate的属性信息
 * （3）在测试类中分别创建AbstractStudent和undergraduate对象，调用他们的show方法
 * @author Guoqianliang
 * @date 15:15 - 2021/3/15
 */
public class Demo02 {
    public static void main(String[] args) {
        AbstractStudent abstractStudent = new AbstractStudent("小王", 23) {
            @Override
            public void show() {
                super.show();
            }
        };
        abstractStudent.show();

        Undergraduate undergraduate = new Undergraduate("小花", 18, "本科");
        undergraduate.show();
    }
}

/**
 * 学生抽象类
 */
abstract class AbstractStudent {
    public String name;
    public Integer age;

    public AbstractStudent(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("我是一个学生，我叫" + name + ",我今年" + age + "岁了。");
    }
}

/**
 * 本科类
 */
class Undergraduate extends AbstractStudent {
    private String degree;

    public Undergraduate(String name, Integer age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    @Override
    public void show() {
        System.out.println("我是一个学生，我叫" + name + ",我今年" + age + "岁了,我的学历是" + degree + "。");
    }
}
