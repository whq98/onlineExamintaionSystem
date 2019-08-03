package com.fs.service;

import com.fs.vo.Examination;

public interface IExaminationService {

	Examination selectExaminationByClazzId(int clazzId);

	int publishExaminationByKeys(String examinationName, int examinationType, int subjectNum, String categoryids,
			int clazzId, int teacherId);

	int endExaminationByExaminationId(int examinationId);

}
