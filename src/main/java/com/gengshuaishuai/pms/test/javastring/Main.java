package com.gengshuaishuai.pms.test.javastring;


import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/20 8:52
 * @description
 */
public class Main {
    public static void main(java.lang.String[] args) {
        java.lang.String str="输入报文头：123";
        String.charAt(str,0);
        String.subString(str, 6);
        ObjectMapper mapper = new ObjectMapper();
    }
}

