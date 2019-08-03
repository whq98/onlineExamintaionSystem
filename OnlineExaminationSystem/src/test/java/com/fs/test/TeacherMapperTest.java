package com.fs.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.mapper.TeacherMapper;
import com.fs.po.Teacher;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mapper.xml")
public class TeacherMapperTest {
	@Autowired
	private TeacherMapper teacherMapper;
	@Test
	public void selectByNoAndPwdTest() {
		Teacher teacher = this.teacherMapper.selectByNoAndPwd("1", "123456");
		System.out.println(teacher);
	}
}
