package com.fs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fs.data.CommonData;
import com.fs.service.IClazzService;
import com.fs.vo.Clazz;

@Controller
public class ClazzContoller {
	@Autowired
	private IClazzService clazzService;
	
	@ResponseBody
	@RequestMapping(value={"/updateClazzByKeys.do"},method=RequestMethod.POST)
	public String updateClazzByKeys(int clazzId, String clazzCol, String newText) {
		int r = this.clazzService.updateClazzByKeys(clazzId, clazzCol, newText);
		String inf =null;
		if(r==1) {
			inf=CommonData.YES;
			return inf;
		}else {
			inf=CommonData.NO;
			return inf;
		}
	}
	
	@ResponseBody
	@RequestMapping("/fuzzyQueryClazz.do")
	public List<Clazz> fuzzyQueryByKey(String key) {
		List<Clazz> list = this.clazzService.fuzzyQueryByKey(key);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/selectAllClazz.do")
	public List<Clazz> selectAllClazz() {
		List<Clazz> list = this.clazzService.selectAll();
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value={"/addClazzByNameAndMajor.do"},method=RequestMethod.POST)
	public String addClazzByNameAndMajor(String name, String major) {
		int r = this.clazzService.addClazzByNameAndMajor(name, major);
		String inf = null;
		if (r == 1) {
			inf = CommonData.YES;
			return inf;
		} else {
			inf = CommonData.NO;
			return inf;
		}

	}
	@ResponseBody
	@RequestMapping(value={"/deleteClazz.do"})
	public String deleteClazzById(int id) {
		int r = this.clazzService.deleteClazzById(id);
		String inf = null;
		if (r == 1) {
			inf = CommonData.YES;
			return inf;
		} else {
			inf = CommonData.NO;
			return inf;
		}

	}
	@RequestMapping(value={"/toStudent.do"})
	public String toStudet() {
		return "/WEB-INF/stu.html";
	}
	@RequestMapping("clazz.do")
	public String clazz() {
		return "/WEB-INF/clazz.html";
	}
}
