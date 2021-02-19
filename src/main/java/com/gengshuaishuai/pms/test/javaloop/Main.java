package com.gengshuaishuai.pms.test.javaloop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/19 11:53
 * @description
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        ForLoop.listFor(list);
    }
}
