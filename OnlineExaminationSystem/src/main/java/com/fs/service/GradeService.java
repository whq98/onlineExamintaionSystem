package com.fs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.ExaminationMapper;
import com.fs.mapper.GradeMapper;
import com.fs.po.Grade;
import com.fs.po.Ids;
@Service
public class GradeService implements IGradeService{
	@Autowired
	private GradeMapper gradeMapper;
	@Override
	public List<Grade> selectAll(int studentId, int teacherId, int clazzId) {
		Ids ids = new Ids(studentId,teacherId,clazzId);
		return this.gradeMapper.selectAll(ids);
	}
	@Override
	public List<Grade> getClazzGrade(int teacherId, int clazzId) {
		//只能查询考试已经结束的成绩
		int state=1;
		return this.gradeMapper.selectClazzGrade(teacherId, clazzId, state);
	}
	
}
