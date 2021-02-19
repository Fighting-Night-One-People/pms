package com.gengshuaishuai.pms.test.annotationorder;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/7 15:59
 * @description
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Field[] fields = student.getClass().getDeclaredFields();
        for(int i=0;i<fields.length;i++){
            int order = fields[i].getAnnotation(BeanFieldAnnotation.class).order();
            log.info(order+"");
        }

    }
}
