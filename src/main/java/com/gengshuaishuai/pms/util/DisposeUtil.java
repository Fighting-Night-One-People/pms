package com.gengshuaishuai.pms.util;

import java.util.UUID;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/20 19:51
 * @description
 */
public class DisposeUtil {
    /**
     * show 生成UUID
     * @return
     */
    public static String generateUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
