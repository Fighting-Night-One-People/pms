package com.gengshuaishuai.pms.test.annotationorder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/7 15:54
 * @description
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BeanFieldAnnotation {
    /**
     * show 标注该属性的顺序
     *
     * @return 该属性的顺序
     */
    int order();
}
