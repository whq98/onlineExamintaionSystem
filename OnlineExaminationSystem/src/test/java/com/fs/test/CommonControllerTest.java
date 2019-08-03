package com.fs.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.controller.CommonContoller;
import com.fs.po.Student;
import com.fs.service.IStudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class CommonControllerTest {
	@Autowired
	private CommonContoller contoller;
	@Test
	public void loginTest() {
		Object stu = this.contoller.ajaxLogin("001", "123456", "student");
		System.out.println(stu);
	}
}
