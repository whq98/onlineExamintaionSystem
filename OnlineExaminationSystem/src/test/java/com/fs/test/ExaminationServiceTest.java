package com.fs.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.mapper.ExaminationMapper;
import com.fs.po.Examination;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mapper.xml","classpath:spring/spring-service.xml"})
public class ExaminationServiceTest {

	@Autowired
	private ExaminationMapper examinationMapper;
	@Test
	public void selectExaminationByClazzIdTest() {
		Examination exam = this.examinationMapper.selectExaminationByClazzIdAndState(2, 2);
		System.out.println(exam.strDate());
	}
	
}
