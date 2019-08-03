package com.fs.service;

import java.util.List;

import com.fs.po.Student;

public interface IStudentService {
	List<Student> selectAllStudents(int clazzId);

	int addStudentByKeys(String name, String no, String sex, String pwd, int clazzId);

	int deleteStudent(int studentId);

	int updateStudentByKeys(int studentId, String studentCol, String newText, int clazzId);

	List<Student> fuzzyQueryByKey(String key);

	Student login(String no, String pwd);
}
