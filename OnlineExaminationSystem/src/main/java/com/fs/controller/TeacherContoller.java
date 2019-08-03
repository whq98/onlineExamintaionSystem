package com.fs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fs.data.CommonData;
import com.fs.service.ITeacherService;

@Controller
public class TeacherContoller {
	@Autowired
	private ITeacherService teacherService;
	@RequestMapping("subject.do")
	public String subject() {
		return "/WEB-INF/subject.html";
	}
	@RequestMapping("/toTeacherHtmlTrue.do")
	public String toTeacherHtmlTrue() {
		return "/WEB-INF/teacher.html";
	}
	@ResponseBody
	@RequestMapping(value = "/toTeacherHtmlFake.do")
	public String toTeacherHtmlFake(int teacherId) {
		int state = this.teacherService.loginState(teacherId).getState();
		if (state != 0) {
//			return "/WEB-INF/teacher.html";
			return CommonData.YES;
		} else {
			return CommonData.NO;
		}
	}
	@ResponseBody
	@RequestMapping(value={"/logoff.do"})
	public String logoff(int teacherId ) {
		int r = this.teacherService.logoff(teacherId);
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
