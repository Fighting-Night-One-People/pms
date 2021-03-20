package com.gengshuaishuai.pms.test.javaoperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/2/25 18:08
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        Main.setStudent(stu);
        System.out.println(stu);
    }

    private static void setStudent(Student stu) {
        stu.setCard(90);
    }

}

@Setter
@Getter
@ToString
class Student {
    private Integer card;
}
