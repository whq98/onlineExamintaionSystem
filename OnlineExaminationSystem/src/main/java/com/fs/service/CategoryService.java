package com.fs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.CategoryMapper;
import com.fs.po.Category;
@Service
public class CategoryService implements ICategoryService {
	@Autowired
	private CategoryMapper categoryMapper;
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return this.categoryMapper.selectCategoryAll();
	}

}
