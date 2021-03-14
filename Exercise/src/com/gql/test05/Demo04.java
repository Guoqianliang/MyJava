package com.gql.test05;

import java.util.StringJoiner;

/**
 * @Description: 定义“人”类。
 *      属性：姓名、性别、年龄等。使用封装的方式编写程序
 *      要求对年龄进行安全控制，合法的年龄范围为[0~100]，其他值表示不合法
 * @author Guoqianliang
 * @date 18:08 - 2021/3/14
 */
public class Demo04 {
    public static void main(String[] args) {
        Person person = new Person("王小花", "女", 10);
        System.out.println("合法赋值后的对象===>" + person);

        person.setAge(110);
        System.out.println("错误赋值后的对象===>" + person);
    }
}

class Person {
    private String name;
    private String gender;
    private Integer age;

    public Person() {
    }

    public Person(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        try {
            Integer minAge = 0, maxAge = 100;
            if (age < minAge || age > maxAge) {
                throw new Exception("年龄不合法！合法的年龄范围为[0~100]！");
            }
            this.age = age;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        try {
            Integer minAge = 0, maxAge = 100;
            if (age < minAge || age > maxAge) {
                throw new Exception("年龄不合法！合法的年龄范围为[0~100]！");
            }
            this.age = age;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("gender='" + gender + "'")
                .add("age=" + age)
                .toString();
    }
}
