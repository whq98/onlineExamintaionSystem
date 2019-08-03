package com.fs.service;

import java.util.List;

import com.fs.po.Grade;



public interface IGradeService {
	List<Grade> selectAll(int studentId,int teacherId,int clazzId);

	List<Grade> getClazzGrade(int teacherId, int clazzId);
}
