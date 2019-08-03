package com.fs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fs.po.Grade;
import com.fs.po.Ids;


public interface GradeMapper {
	/***/
	/**查询所有成绩*/
	List<Grade> selectAll(Ids ids);
	List<Grade> selectClazzGrade(@Param("teacherId")int teacherId,@Param("clazzId")int clazzId,@Param("state")int state);
}
