package com.gengshuaishuai.pms.test.javastring;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/24 9:54
 * @description
 */
@Slf4j
public class String {
    /**
     * show 字符串截取
     *
     * @param value
     * @param index 字符串的index(索引)从0开始，截取时[index,MAX]
     * @return
     */
    public static java.lang.String subString(java.lang.String value, int index){
        java.lang.String substring = value.substring(index);
        log.info("\n原字符串为---->"+value+"\n从"+index+"位置截取后字符串为---->"+substring);
        return substring;
    }

    /**
     * show 检索字符串某个位置的字符
     *
     * @param value
     * @param index
     * @return
     */
    public static char charAt(java.lang.String value, int index){
        char cr = value.charAt(index);
        log.info("\n原字符串为---->"+value+"\n第"+index+"位置的字符为---->"+cr);
        return cr;
    }
}
