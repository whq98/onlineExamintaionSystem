package com.fs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fs.po.Grade;
import com.fs.service.IGradeService;

@Controller
public class GradeController {
	@Autowired
	private IGradeService gradeService;
	@ResponseBody
	@RequestMapping("/getClazzGrade.do")
	public List<Grade> getClazzGradeByKeys(int teacherId,int clazzId) {
		List<Grade> list = this.gradeService.getClazzGrade(teacherId,clazzId);
		return list;
	}
	@ResponseBody
	@RequestMapping("/getAllGradesByKeys.do")
	public List<Grade> getAllGradesByKeys(int studentId,int teacherId,int clazzId) {
		System.out.println(teacherId+":"+clazzId+":"+studentId);
		List<Grade> list = this.gradeService.selectAll(studentId,teacherId,clazzId);
		return list;
	}
}
