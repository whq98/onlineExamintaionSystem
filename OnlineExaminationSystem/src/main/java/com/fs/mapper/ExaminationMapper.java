package com.fs.mapper;

import org.apache.ibatis.annotations.Param;

import com.fs.po.Examination;

public interface ExaminationMapper {

	Examination selectExaminationByClazzIdAndState(@Param("clazzId")int clazzId, @Param("state")int state);

	int insertExaminationByExamination(Examination exam);

	int updateStateByExaminationIdAndState(@Param("examinationId")int examinationId, @Param("state")int state);
}
