package com.gql.test05;

/**
 * @Description: 某公司正进行招聘工作，被招聘人员需要填写，做“个人简历”的封装类，并打印简历信息。
 * 属性（姓名  年龄 身高 性别  毕业学校  婚姻状况 联系方式），方法（打印  showInfo()）
 * @author Guoqianliang
 */
public class Demo01 {
    public static void main(String[] args) {
        Bio gql = new Bio("郭乾亮", 22, 180, "男", "哈尔滨佛学院", "保密", "保密");
        gql.showInfo();
    }
}

/**
 * 个人简历类
 */
class Bio {
    // 属性
    private String name;
    private Integer age;
    private int height;
    private String gender;
    private String school;
    private String maritalStatus;
    private String tel;

    // 无参构造
    public Bio() {
    }

    // 有参构造
    public Bio(String name, Integer age, int height, String gender, String school, String maritalStatus, String tel) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.school = school;
        this.maritalStatus = maritalStatus;
        this.tel = tel;
    }

    public void showInfo() {
        System.out.println("《简历信息》：姓名=" + name + ",年龄=" + age + ",身高=" + height + ",学校=" + school + ",婚姻状况=" + maritalStatus + ",电话=" + tel);
    }
}
