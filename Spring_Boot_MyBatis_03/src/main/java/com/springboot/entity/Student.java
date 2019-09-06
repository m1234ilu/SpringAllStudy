package com.springboot.entity;

import java.io.Serializable;

/**
 * @author zycstart
 * @create 2019-08-22 0:35
 */
public class Student implements Serializable {
    private String sno;
    private String name;
    private String sex;
    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
