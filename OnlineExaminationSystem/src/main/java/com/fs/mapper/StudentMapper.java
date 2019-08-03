package com.fs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fs.po.Student;

public interface StudentMapper {
	/***/
	/**@Param("")*/
	/**通过班级id查询本班所有学生*/
	List<Student> selectAll(int clazzId);
	/**通过student对象插入一个stu 到数据库中*/
	int addStudentByStudent(Student stu);
	int deleteStudentByStudentId(int studentId);
	int updateByStudent(Student student);
	List<Student> fuzzyQueryByStudent(Student student);
	Student selectStudentByNoAndPwd(@Param("no")String no, @Param("pwd")String pwd);
}
