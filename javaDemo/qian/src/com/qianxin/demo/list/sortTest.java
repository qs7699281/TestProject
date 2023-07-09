package com.qianxin.demo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortTest {
    public static void main(String[] args) {
        Test a = new Test("2023-07-07","我是1");
        Test b = new Test("2023-06-01","我是2");
        List<Test> list = new ArrayList<>(Arrays.asList(a,b));
        list.forEach(m -> System.out.println("排序前 " + (m.getName())));
        list = list.stream().sorted(Comparator.comparing(Test::getTime)).collect(Collectors.toList());
        list.forEach(m -> System.out.println("排序后 " + (m.getName())));
    }
}

class Test {
    public Test(String time,String name) {
        this.time = time;
        this.name = name;
    }

    private String time;
    private String name;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
