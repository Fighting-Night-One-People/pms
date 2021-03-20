package com.gengshuaishuai.pms.test.javacollection;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/20 11:09
 * @description
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(7);
        map.put("interface", "true");
        log.info(map.get("interface"));
        map.put("interface", "false");
        log.info(map.get("interface"));
    }
}
