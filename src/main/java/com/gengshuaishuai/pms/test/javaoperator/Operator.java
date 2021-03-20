package com.gengshuaishuai.pms.test.javaoperator;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/25 18:19
 * @description
 */
public class Operator {
    public static void autoIncrementPrefix(){
        int size=1;
        for(int i=0;i<5;i++){
            Student student = new Student();
            student.setCard(size++);
            System.out.println(student);
        }
    }
    public static void autoIncrementSuffix(){
        int count=1;
        for(int i=0;i<5;i++){
            Student student = new Student();
            student.setCard(++count);
            System.out.println(student);
        }
    }
}
