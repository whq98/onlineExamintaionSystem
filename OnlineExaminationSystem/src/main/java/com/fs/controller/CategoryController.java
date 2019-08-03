package com.fs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fs.po.Category;
import com.fs.service.ICategoryService;

@Controller
public class CategoryController {
	@Autowired
	private ICategoryService categoryService;
	
	@ResponseBody
	@RequestMapping("/selectCategoryAll.do")
	public List<Category> selectAllClazz() {
		List<Category> list = this.categoryService.getAllCategory();
		return list;
	}
	

}
