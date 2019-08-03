package com.fs.vo;


public class Examination {
	private int id;
	private int clazzId;
	private int teacherId;
	private int subjectNum;
	private int state;
	private int examinationType;
	private String name;
	private String category;
	private String beginTime;
	
	
	public Examination() {
		super();
	}
	
	public Examination(int id, int clazzId, int teacherId, int subjectNum, int state, int examinationType, String name,
			String category, String beginTime) {
		super();
		this.id = id;
		this.clazzId = clazzId;
		this.teacherId = teacherId;
		this.subjectNum = subjectNum;
		this.state = state;
		this.examinationType = examinationType;
		this.name = name;
		this.category = category;
		this.beginTime = beginTime;
	}

	@Override
	public String toString() {
		return "vo...Examination [id=" + id + ", clazzId=" + clazzId + ", teacherId=" + teacherId + ", subjectNum="
				+ subjectNum + ", state=" + state + ", examinationType=" + examinationType + ", name=" + name
				+ ", category=" + category + ", beginTime=" + beginTime + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getSubjectNum() {
		return subjectNum;
	}
	public void setSubjectNum(int subjectNum) {
		this.subjectNum = subjectNum;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getExaminationType() {
		return examinationType;
	}
	public void setExaminationType(int examinationType) {
		this.examinationType = examinationType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	
}
