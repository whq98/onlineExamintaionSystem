package com.fs.mapper;

import org.apache.ibatis.annotations.Param;

import com.fs.po.Teacher;

public interface TeacherMapper {
	Teacher selectByNoAndPwd(@Param("no")String no,@Param("pwd")String pwd);
	Teacher selectState(int id);
	int updateStateOff(int teacherId);
	int updateStateIn(int teacherId);
}
