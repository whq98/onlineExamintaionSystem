package com.fs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fs.data.CommonData;
import com.fs.vo.Examination;
import com.fs.service.IExaminationService;

@Controller
public class ExaminationController {
	@Autowired
	private IExaminationService examinationService;
	
	@ResponseBody
	@RequestMapping(value="/endExamination.do",method = RequestMethod.POST)
	public String endExaminationByExaminationId(int examinationId) {
		int r = this.examinationService.endExaminationByExaminationId(examinationId);
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
	@RequestMapping(value="/publishExaminationByKeys.do",method = RequestMethod.POST)
	public String publishExaminationByKeys(String examinationName, 
			int examinationType,
			int subjectNum,
			String categoryids,
			int clazzId,
			int teacherId) {
		int r = this.examinationService.publishExaminationByKeys(examinationName, 
				examinationType,
				subjectNum,
				 categoryids,
				 clazzId,
				 teacherId);
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
	@RequestMapping("/selectExaminationByClazzId.do")
	public Examination selectExaminationByClazzId(int clazzId) {
		Examination examination = this.examinationService.selectExaminationByClazzId(clazzId);
		return examination;
	}
}
