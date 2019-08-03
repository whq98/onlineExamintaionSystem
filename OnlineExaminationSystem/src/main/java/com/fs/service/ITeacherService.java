package com.fs.service;

import com.fs.po.Teacher;

public interface ITeacherService {
	Teacher login(String no,String pwd);
	Teacher loginState(int id);
	int logoff(int teacherId);
	int updateLogOn(int id);
}
