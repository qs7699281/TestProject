package com.qianxin.demo.thread;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
