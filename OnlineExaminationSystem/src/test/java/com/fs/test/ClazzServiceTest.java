package com.fs.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.service.ClazzService;
import com.fs.vo.Clazz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mapper.xml","classpath:spring/spring-service.xml"})
public class ClazzServiceTest {

	@Autowired
	private ClazzService clazzService;
	@Test
	public void selectAllClazzsTest() {
		List<Clazz> list = this.clazzService.selectAll();
		for (Clazz clazz : list) {
			System.out.println(clazz);
		}
	}
}
