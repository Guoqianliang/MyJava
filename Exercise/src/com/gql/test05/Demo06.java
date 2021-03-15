package com.gql.test05;

/**
 * @Description: 设计一个员工类，其中有计算员工薪水的方法。根据员工职务的不同，薪水计算方式也不同。
 *           员工类型              薪水构成
 * ---------------------------------------------------
 *            经理                  底薪 + 奖金
 *            销售人员              底薪 + 提成
 *            普通员工              底薪 + 补贴（车补、饭补等等）
 *  然后，设计一个测试类，测试一下。
 *      场景：年终，领导找员工谈话，让员工介绍自己的薪水。打印出来要求：信息尽可能详细。
 * @author Guoqianliang
 * @date 20:35 - 2021/3/14
 */
public class Demo06 {
    public static void main(String[] args) {
        EmployeeService ManagerImpl = new ManagerImpl(20000, 5000);
        ManagerImpl.tell();

        EmployeeService SalesmanImpl = new SalesmanImpl(10000, 2000);
        SalesmanImpl.tell();

        EmployeeService StaffImpl = new StaffImpl(4000, 100, 200, 50);
        StaffImpl.tell();
    }
}

/**
 *  Person接口
 */
interface EmployeeService {
    /**
     * 定义一个tell方法
     */
    void tell();
}

/**
 * 经理类
 */
class ManagerImpl implements EmployeeService {
    private double basicSalary;
    private double bonus;

    public ManagerImpl(double basicSalary, double bonus) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public void tell() {
        System.out.println("老板好,我是负责研发的项目经理,上个月我一共发了" +
                (basicSalary + bonus) + "元,其中包括底薪" + basicSalary + "元,奖金" + bonus + "元。我会继续努力，争取明年给您换一辆兰博基尼！");
    }
}

/**
 * 销售人员类
 */
class SalesmanImpl implements EmployeeService {
    private double basicSalary;
    private double pushMoney;

    public SalesmanImpl(double basicSalary, double pushMoney) {
        this.basicSalary = basicSalary;
        this.pushMoney = pushMoney;
    }

    @Override
    public void tell() {
        System.out.println("老板好,我是公司的销售员,上个月我一共发了" +
                (basicSalary + pushMoney) + "元,其中包括底薪" + basicSalary + "元,提成" + pushMoney + "元。我会继续努力，争取明年给您换一块新的天王表！");
    }
}

/**
 * 普通员工类
 */
class StaffImpl implements EmployeeService {
    private double basicSalary;
    private double carAllowance;
    private double mealAllowance;
    private double tellAllowance;


    public StaffImpl(double basicSalary, double carAllowance, double mealAllowance, double tellAllowance) {
        this.basicSalary = basicSalary;
        this.carAllowance = carAllowance;
        this.mealAllowance = mealAllowance;
        this.tellAllowance = tellAllowance;
    }

    @Override
    public void tell() {
        System.out.println("老板好,我是一个普通员工,上个月我一共发了" +
                (basicSalary + carAllowance + mealAllowance + tellAllowance) + "元," +
                "其中包括底薪" + basicSalary + "元,车补" + carAllowance + "元,饭补" + mealAllowance + "元,话费补贴" + tellAllowance + "元。我不想努力了！");
    }
}

