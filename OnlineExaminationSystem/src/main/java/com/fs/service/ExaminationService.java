package com.fs.service;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.ExaminationMapper;
import com.fs.vo.Examination;

@Service
public class ExaminationService implements IExaminationService {
	@Autowired
	private ExaminationMapper examinationMapper;

	@Override
	public Examination selectExaminationByClazzId(int clazzId) {
		int state=2;
		com.fs.po.Examination exam1=this.examinationMapper.selectExaminationByClazzIdAndState(clazzId,state);
		if(exam1==null) {
			return null;
		}else {
			Examination exam2= new Examination(exam1.getId(),exam1.getClazzId(),exam1.getTeacherId(),exam1.getSubjectNum(),exam1.getState(),exam1.getExaminationType(),exam1.getName(),exam1.getCategory(),exam1.strDate());
			return exam2;
		}
	}

	@Override
	public int publishExaminationByKeys(String examinationName, int examinationType, int subjectNum, String categoryids,
			int clazzId, int teacherId) {
		com.fs.po.Examination exam=new com.fs.po.Examination(clazzId,teacherId,subjectNum,examinationType,examinationName,categoryids);
		exam.setBeginTime(new Date(System.currentTimeMillis()));
		//每个班只能有一个考试,标志状态为2,数据库默认为2
		return this.examinationMapper.insertExaminationByExamination(exam);
	}

	@Override
	public int endExaminationByExaminationId(int examinationId) {
		int state=1;
		//1表示结束考试,2表示正在考试
		return this.examinationMapper.updateStateByExaminationIdAndState(examinationId,state);
	}


	


}
