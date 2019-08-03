package com.fs.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.mapper.CategoryMapper;
import com.fs.po.Category;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mapper.xml")
public class CategoryMapperTest{
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Test
	public void selectAllTest() {
		List<Category> list = this.categoryMapper.selectCategoryAll();
		for (Category category : list) {
			System.out.println(category);
		}
		
	}
}
