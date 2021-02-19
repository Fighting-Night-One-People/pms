package com.gengshuaishuai.pms.test.javaloop;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/19 11:53
 * @description
 */
@Slf4j
public class WhileLoop {
    public static void listWhile(List<Integer> list) {
        int j = 0;
        while (j < list.size()) {
            log.info("遍历结果j：" + list.get(j));
            j = j + 3;
        }
    }
}
