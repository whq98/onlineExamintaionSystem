package com.fs.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.mapper.StudentMapper;
import com.fs.po.Student;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mapper.xml")
public class StudentMapperTest{
	@Autowired
	private StudentMapper studentMapper;
	
	@Test
	public void selectStudentByNoAndPwdTest() {
		Student stu = this.studentMapper.selectStudentByNoAndPwd("001", "123456");
			System.out.println(stu);
	}
}
