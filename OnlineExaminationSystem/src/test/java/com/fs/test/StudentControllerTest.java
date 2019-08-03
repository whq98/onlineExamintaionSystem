package com.fs.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.po.Student;
import com.fs.service.IStudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class StudentControllerTest {
	@Autowired
	private IStudentService studentService;
	@Test
	public void loginTest() {
		Student stu = this.studentService.login("001", "123456");
		System.out.println(stu);
	}
}
