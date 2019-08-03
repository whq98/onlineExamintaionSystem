package com.fs.po;

public class Ids {
	private int id;
	private int clazzId;
	private int teacherId;
	private int studentId;
	private int examinationId;
	private int subjectId;
	private int gradeId;
	private int categoryId;
	
	public Ids() {
		super();
	}
	
	@Override
	public String toString() {
		return "Ids [id=" + id + ", clazzId=" + clazzId + ", teacherId=" + teacherId + ", studentId=" + studentId
				+ ", examinationId=" + examinationId + ", subjectId=" + subjectId + ", gradeId=" + gradeId
				+ ", categoryId=" + categoryId + "]";
	}

	public Ids(int clazzId, int teacherId, int studentId) {
		super();
		this.clazzId = clazzId;
		this.teacherId = teacherId;
		this.studentId = studentId;
	}

	public Ids(int clazzId, int teacherId) {
		super();
		this.clazzId = clazzId;
		this.teacherId = teacherId;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getExaminationId() {
		return examinationId;
	}

	public void setExaminationId(int examinationId) {
		this.examinationId = examinationId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getClazzId() {
		return clazzId;
	}
	public void setClazzId(int clazzId) {
		this.clazzId = clazzId;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
