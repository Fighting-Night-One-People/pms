package com.gengshuaishuai.pms.test.javaloop;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/5 20:04
 * @description
 */
@Slf4j
public class ForLoop {
    public static void listFor(List<Integer> list) {
        for (int i = 0; i < list.size(); ) {
            log.info("遍历结果i：" + list.get(i));
            i += 2;
        }
    }
}
