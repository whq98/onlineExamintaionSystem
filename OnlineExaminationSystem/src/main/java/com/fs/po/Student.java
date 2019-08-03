package com.fs.po;

public class Student {
	private int id;
	private String no;
	private String name;
	private String sex;
	private String pwd;
	private int clazzId;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", no=" + no + ", name=" + name + ", sex=" + sex + ", pwd=" + pwd + ", clazzId="
				+ clazzId + "]";
	}

	public Student() {
		super();
	}

	public Student(String no, String name, String sex, String pwd, int clazzId) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.pwd = pwd;
		this.clazzId = clazzId;
	}

	public Student(int id, String no, String name, String sex, String pwd, int clazzId) {
		super();
		this.id = id;
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.pwd = pwd;
		this.clazzId = clazzId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getclazzId() {
		return clazzId;
	}

	public void setclazzId(int clazzId) {
		this.clazzId = clazzId;
	}

}
