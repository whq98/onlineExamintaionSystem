package com.fs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fs.data.CommonData;
import com.fs.po.Student;
import com.fs.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	private IStudentService studentService;
	
	@ResponseBody
	@RequestMapping("/fuzzyQueryStudent.do")
	public List<Student> fuzzyQueryByKey(String key) {
		List<Student> list = this.studentService.fuzzyQueryByKey(key);
		return list;
	}
	
	
	@ResponseBody
	@RequestMapping(value={"/updateStudentByKeys.do"},method=RequestMethod.POST)
	public String updateStudentByKeys(int studentId, String studentCol, String newText,int clazzId) {
		int r = this.studentService.updateStudentByKeys(studentId, studentCol, newText,clazzId);
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
	@RequestMapping("/deleteStudent.do")
	public String deleteStudentByStudentId(int studentId){
		int r = this.studentService.deleteStudent(studentId);
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
	@RequestMapping("/selectAllStudent.do")
	public List<Student> showAllStudent(int clazzId){
		List<Student> list = this.studentService.selectAllStudents(clazzId);
		return list;
	}
	@ResponseBody
	@RequestMapping(value="/addStudentByKeys.do",method = RequestMethod.POST)
	public String addStudentByKeys(String name,String no,String sex,String pwd,int clazzId){
		int r = this.studentService.addStudentByKeys(name,no,sex,pwd,clazzId);
		String inf =null;
		if(r==1) {
			inf=CommonData.YES;
			return inf;
		}else {
			inf=CommonData.NO;
			return inf;
		}
	}
}
