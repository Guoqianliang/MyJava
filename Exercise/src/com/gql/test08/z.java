package com.gql.test08;

/**
 * @Description: 学会使用Java异常处理语句：
 *  try{
 *  	可能发生异常的语句
 *  }catch(Exception){
 *  	捕获异常
 *  }finally{
 *  	无论是否有异常,都进入执行.
 *  }
 * @author Guoqianliang
 * @date 17:57 - 2021/3/15
 */
public class z {
    public static void main(String[] args) {
        try {
            int var01 = 5;
            int var02 = 0;
            System.out.println(var01 + "÷" + var02 + "=" + var01 / var02);
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("方法执行结束");
        }
    }
}
