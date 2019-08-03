package com.fs.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.mapper.ClazzMapper;
import com.fs.po.Clazz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mapper.xml")
public class ClazzMapperTest{
	@Autowired
	private ClazzMapper clazzMapper;
	
	@Test
	public void updateByClazzTest() {
		int r = this.clazzMapper.updateByClazz(new Clazz(5,"asdasd","basdad",new Date(System.currentTimeMillis())));
		System.out.println("执行成功了"+r+"条记录");
	}
	@Test
	public void insertByClazzTest() {
		Clazz clazz=new Clazz();
		clazz.setName("一年级");
		clazz.setMajor("学语文");
		clazz.setBeginDate(new Date(System.currentTimeMillis()));
		int r = this.clazzMapper.insertByClazz(clazz);
		System.out.println("执行成功了"+r+"条记录");
	}
	
	@Test
	public void fuzzyQueryByClazzTest() {
		String key="班";
		Clazz clazz2 = new Clazz();
		clazz2.setName("%"+key+"%");
		clazz2.setMajor("%"+key+"%");
		List<Clazz> list = this.clazzMapper.fuzzyQueryByClazz(clazz2);
		for (Clazz clazz : list) {
			System.out.println(clazz);
		}
		
	}
	@Test
	public void selectAllTest() {
		List<Clazz> list = this.clazzMapper.selectAll();
		for (Clazz clazz : list) {
			System.out.println(clazz.strDate());
		}
		
	}
}
