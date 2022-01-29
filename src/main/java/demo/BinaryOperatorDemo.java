package demo;

import leetcode.editor.cn.base.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author lixiangyang51@jd.com
 * date 2022/1/29 5:06 PM
 * Copyright © 2004-2022 JD.COM. All Rights Reserved.
 */
public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (o, n) -> n;
        System.out.println(binaryOperator.apply(2, 3));
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setAge(1);
        p2.setAge(1);
        p1.setName("1");
        p2.setName("1");
        List<Person> list = new ArrayList();
        list.add(p1);
        list.add(p2);
        //(o, n) -> n)去重
        Map<String, Person> collect = list.stream().filter(e -> e.getAge() > 0)
                .collect(Collectors.toMap(Person::getName, Function.identity(), (o, n) -> n));
        System.out.println(collect);//{1=Person(name=1, age=1)}

    }
}
