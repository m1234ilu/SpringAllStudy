package com.springboot.controller;

import com.springboot.dao.StudentDao;
import com.springboot.dao.StudentDao2;
import com.springboot.entity.Student;
import com.springboot.entity.Student2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.SchemaOutputResolver;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentDao2 studentDao2;

    @GetMapping(value = "/queryAllStudent")
    public List<Student> queryAllStudent() {
        return this.studentDao.getAllStudent();
    }

    @GetMapping(value = "/selectById/{sno}")
    public Student selectById(@PathVariable String sno) {
        return studentDao.selectById(sno);
    }

    @GetMapping(value = "/selectByUpdateTime/{updateTime}")
    public List<Student> selectByUpdateTime(@PathVariable String updateTime) {
        return studentDao.selectByUpdateTime(updateTime);
    }

    @PostMapping("/insert")
    public Integer insert(Student student) {
        //  student.setCreateTime(new java.sql.Date(System.currentTimeMillis()));

        return studentDao.insertSelective(student);
    }

    @GetMapping(value = "/bigger/{start}")
    public List<Student> bigger(@PathVariable java.sql.Date start) {
        return studentDao.bigger(start);
    }

    @PostMapping("/insert2")
    public Integer insert2(Student student, String ss) {
        Student2 student2 = new Student2();
        student2.setEndtime(student.getUpdateTime());
        student2.setStarttime(student.getCreateTime());
        student2.setSs(ss);
        return studentDao2.insert2(student2);
    }

    @GetMapping("/insertBatch")
    public void insertBatch() {
        List<Student2> list = new ArrayList<>();
        Student2 student2 = new Student2(new Date(), new Date(), "1");
        Student2 student21 = new Student2(new Date(), new Date(), "2");
        list.add(student2);
        list.add(student21);
        studentDao2.insertBatch(list);
    }


    public static void main(String[] args) {
        System.out.println(new Date());
    }


}
