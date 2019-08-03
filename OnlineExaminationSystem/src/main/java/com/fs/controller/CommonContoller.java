package com.fs.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fs.data.CommonData;
import com.fs.po.Student;
import com.fs.po.Teacher;
import com.fs.service.IStudentService;
import com.fs.service.ITeacherService;
import com.fs.service.StudentService;

@Controller
public class CommonContoller {
	@Autowired
	private ITeacherService teacherService;
	@Autowired
	private IStudentService studentService;
	@RequestMapping("/login.do")
	public String login(String no, String pwd, String role, HttpServletResponse response) {
		if ("teacher".equals(role)) {
			Teacher teacher = this.teacherService.login(no, pwd);
			if (teacher != null) {
				String teacherStr = null;
				try {
					teacherStr = URLEncoder.encode(teacher.toString(), "utf-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				Cookie cookie = new Cookie("teacher", teacherStr);
				response.addCookie(cookie);
				return "/WEB-INF/teacher.html";
			} else {
				return "/login.html";
			}
		} else if ("student".equals(role)) {
			return "/login.html";
		} else {
			return "/login.html";
		}
	}

	@ResponseBody
	@RequestMapping(value = "/ajaxlogin.do", method = RequestMethod.POST)
	public Object ajaxLogin(String no, String pwd, String role) {
		if ("teacher".equals(role)) {
			Teacher teacher = this.teacherService.login(no, pwd);
			int r=this.teacherService.updateLogOn(teacher.getId());
			if (teacher != null && r!=0) {
				return teacher;
			} else {
				return null;
			}
		} else if ("student".equals(role)) {
			Student student=this.studentService.login(no,pwd);
			if(student!=null) {
				return student;
			}else {
				return null;
			}
		} else {
			return null;
		}
	}
}
