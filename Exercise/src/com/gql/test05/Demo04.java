package com.gql.test05;

/**
 * @Description: 定义“人”类。
 *      属性：姓名、性别、年龄等。使用封装的方式编写程序
 *      要求对年龄进行安全控制，合法的年龄范围为[0~100]，其他值表示不合法
 * @author Guoqianliang
 */
public class Demo04 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("张三");
        p.setAge(18);
        p.setGender("男");

        System.out.println(p.getName() + "的年龄是" + p.getAge() + ",性别是" + p.getGender());
    }
}

class Person {
    private String name;
    private String gender;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        try {
            if (age < 0 || age > 100) {
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
}
