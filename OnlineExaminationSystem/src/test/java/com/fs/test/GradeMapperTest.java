package com.fs.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.mapper.GradeMapper;
import com.fs.po.Grade;
import com.fs.po.Ids;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mapper.xml")
public class GradeMapperTest{
	@Autowired
	private GradeMapper gradeMapper;
	
	@Test
	public void selectClazzGradeTest() {
		List<Grade> list = this.gradeMapper.selectClazzGrade(1,1,1);
		for (Grade grade : list) {
			System.out.println(grade);
		}
		
	}
	@Test
	public void selectAllTest() {
		Ids ids = new Ids();
		ids.setExaminationId(1);
		ids.setStudentId(1);
		List<Grade> list = this.gradeMapper.selectAll(ids);
		for (Grade grade : list) {
			System.out.println(grade);
		}
		
	}
}
