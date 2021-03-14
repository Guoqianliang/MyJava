package com.gql.test05;

import java.util.StringJoiner;

/**
 * @Description: 某公司正进行招聘工作，被招聘人员需要填写，做“个人简历”的封装类，并打印简历信息。
 * 属性（姓名  年龄 身高 性别  毕业学校  婚姻状况 联系方式），方法（打印  showInfo()）
 * @author Guoqianliang
 * @date 17:27 - 2021/3/14
 */
public class Demo01 {
    public static void main(String[] args) {
        Bio gql = new Bio("郭乾亮", 22, 180, "男", "保密", "热恋中", "保密");
        System.out.println(gql);
    }
}

/**
 * 个人简历类
 */
class Bio {
    private String name;
    private Integer age;
    private int height;
    private String gender;
    private String school;
    private String maritalStatus;
    private String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Bio() {
    }

    public Bio(String name, Integer age, int height, String gender, String school, String maritalStatus, String tel) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.school = school;
        this.maritalStatus = maritalStatus;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bio.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("height=" + height)
                .add("gender='" + gender + "'")
                .add("school='" + school + "'")
                .add("maritalStatus='" + maritalStatus + "'")
                .add("tel='" + tel + "'")
                .toString();
    }
}
