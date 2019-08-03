package com.fs.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.po.Teacher;
import com.fs.service.TeacherService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mapper.xml","classpath:spring/spring-service.xml"})
public class TeacherServiceTest {
	@Autowired
	private TeacherService teacherService;
	@Test
	public void loginTest() {
		Teacher teacher = this.teacherService.login("1", "123456");
		System.out.println(teacher);
	}
}
