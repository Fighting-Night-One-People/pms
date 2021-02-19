package com.gengshuaishuai.pms.test.annotationorder;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/7 15:56
 * @description
 */
public class Student {
    /**
     * 主键
     */
    @BeanFieldAnnotation(order = 1)
    private String id;
    /**
     * 姓名
     */
    @BeanFieldAnnotation(order = 2)
    private String name;
    /**
     * 性别
     */
    @BeanFieldAnnotation(order = 3)
    private Integer sex;
    /**
     * 年龄
     */
    @BeanFieldAnnotation(order = 4)
    private Integer age;
    /**
     * 爱好
     */
    @BeanFieldAnnotation(order = 5)
    private String happy;
}
