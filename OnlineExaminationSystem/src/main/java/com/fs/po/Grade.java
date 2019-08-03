package com.fs.po;

public class Grade {
	private int id;
	private int stuId;
	private String stuName;
	private int examinationId;
	private String examinationName;
	private String examinationType;
	private int score;

	public Grade() {
		super();
	}
	
	public Grade(int stuId, int examinationId) {
		super();
		this.stuId = stuId;
		this.examinationId = examinationId;
	}
	
	
	public Grade(int stuId, int examinationId, int score) {
		super();
		this.stuId = stuId;
		this.examinationId = examinationId;
		this.score = score;
	}
	
	
	public Grade(int stuId, int examinationId, String examinationType, int score) {
		super();
		this.stuId = stuId;
		this.examinationId = examinationId;
		this.examinationType = examinationType;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", stuId=" + stuId + ", stuName=" + stuName + ", examinationId=" + examinationId
				+ ", examinationName=" + examinationName + ", examinationType=" + examinationType + ", score=" + score
				+ "]";
	}

	public Grade(int stuId, String stuName, int examinationId, String examinationName, String examinationType,
			int score) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.examinationId = examinationId;
		this.examinationName = examinationName;
		this.examinationType = examinationType;
		this.score = score;
	}

	public Grade(int id, int stuId, String stuName, int examinationId, String examinationName, String examinationType,
			int score) {
		super();
		this.id = id;
		this.stuId = stuId;
		this.stuName = stuName;
		this.examinationId = examinationId;
		this.examinationName = examinationName;
		this.examinationType = examinationType;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getExaminationId() {
		return examinationId;
	}

	public void setExaminationId(int examinationId) {
		this.examinationId = examinationId;
	}

	public String getExaminationName() {
		return examinationName;
	}

	public void setExaminationName(String examinationName) {
		this.examinationName = examinationName;
	}

	public String getExaminationType() {
		return examinationType;
	}

	public void setExaminationType(String examinationType) {
		this.examinationType = examinationType;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
