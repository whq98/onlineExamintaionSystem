package com.fs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.StudentMapper;
import com.fs.po.Student;
@Service
public class StudentService implements IStudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public List<Student> selectAllStudents(int clazzId) {
		return this.studentMapper.selectAll(clazzId);
	}
	@Override
	public int addStudentByKeys(String name, String no, String sex, String pwd, int clazzId) {
		Student stu=new Student(no, name, sex, pwd,clazzId);
		return this.studentMapper.addStudentByStudent(stu);
	}
	@Override
	public int deleteStudent(int studentId) {
		return this.studentMapper.deleteStudentByStudentId(studentId);
	}
	@Override
	public int updateStudentByKeys(int studentId, String studentCol, String newText,int clazzId) {
		//去除td前缀
				String studentCols = studentCol.substring(2);
				Student student = new Student();
				student.setId(studentId);
				student.setclazzId(clazzId);
				switch (studentCols) {
				case "no":
					student.setNo(newText);
					break;
				case "name":
					student.setName(newText);
					break;
				case "sex":
					student.setSex(newText);
					break;
				case "pwd":
					student.setPwd(newText);
					break;
				case "clazzId":
					student.setId(Integer.parseInt(newText));
					break;
				default:
					break;
				}
		return this.studentMapper.updateByStudent(student);
	}
	@Override
	public List<Student> fuzzyQueryByKey(String key) {
		Student stu=new Student();
		String keys="%"+key+"%";
		stu.setName(keys);
		stu.setNo(keys);
		stu.setPwd(keys);
		stu.setSex(keys);
		return this.studentMapper.fuzzyQueryByStudent(stu);
	}
	@Override
	public Student login(String no, String pwd) {
		return this.studentMapper.selectStudentByNoAndPwd(no,pwd);
	}

}
