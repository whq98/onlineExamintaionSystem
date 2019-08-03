package com.fs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.TeacherMapper;
import com.fs.po.Teacher;
@Service
public class TeacherService implements ITeacherService {
	@Autowired
	private TeacherMapper teacherMapper;
	public Teacher login(String no, String pwd) {
		return this.teacherMapper.selectByNoAndPwd(no, pwd);
	}
	@Override
	public Teacher loginState(int id) {
		return this.teacherMapper.selectState(id);
	}
	@Override
	public int logoff(int teacherId) {
		return this.teacherMapper.updateStateOff(teacherId);
	}
	@Override
	public int updateLogOn(int id) {
		return this.teacherMapper.updateStateIn(id);
	}

}
