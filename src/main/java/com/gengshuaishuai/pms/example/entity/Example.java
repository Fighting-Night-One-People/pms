package com.gengshuaishuai.pms.example.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * example
 * @author 
 */
@Data
public class Example implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 样例名称
     */
    private String name;

    /**
     * 样例描述
     */
    private String description;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}