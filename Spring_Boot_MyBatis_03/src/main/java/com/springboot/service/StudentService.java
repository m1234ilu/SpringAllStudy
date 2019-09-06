package com.springboot.service;

import com.springboot.entity.Student;

/**
 * @author zycstart
 * @create 2019-08-22 0:39
 */
public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}
