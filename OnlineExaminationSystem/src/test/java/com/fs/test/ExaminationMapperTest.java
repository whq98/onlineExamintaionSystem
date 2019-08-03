package com.fs.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.mapper.ExaminationMapper;
import com.fs.po.Ids;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mapper.xml")
public class ExaminationMapperTest{
	@Autowired
	private ExaminationMapper examinationMapper;
	
	@Test
	public void updateStateByExaminationIdAndStateTest() {
		int r=this.examinationMapper.updateStateByExaminationIdAndState(1, 1);
		System.out.println(r);
	}
	
	}
