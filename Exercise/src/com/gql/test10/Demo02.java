package com.gql.test10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description: 使用ArrayList集合，对其中添加10个不同的元素，并使用Iterator遍历集合。
 * 提示：
 *  （1）使用add()方法将元素添加到ArrayList集合中
 *  （2）调用集合iterator()方法获得Iterator对象，并调用Iterator的hasNext()和next()方法，迭代出集合的所有元素。
 * @author Guoqianliang
 * @date 10:45 - 2021/3/16
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        int var = 10;
        for (int i = 1; i <= var; i++) {
            list.add(i);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
