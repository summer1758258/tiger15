package com.bypg.model;

//javaBean对应学生表实体类
public class StudentInfo {
	
	private Integer stu_id;		//学生主键
	private String stu_name;	//学生姓名
	private int stu_age;		//学生年龄
		
//无惨构造	
	public StudentInfo() {
	}

//构造
	public StudentInfo(String stu_name, int stu_age) {
		this.stu_name = stu_name;
		this.stu_age = stu_age;
	}
	

	public Integer getStu_id() {
		return stu_id;
	}
	public void setStu_id(Integer stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getStu_age() {
		return stu_age;
	}
	public void setStu_age(int stu_age) {
		this.stu_age = stu_age;
	}
	
	
	@Override
	public String toString() {
		return "StudentInfo [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_age=" + stu_age + "]";
	}	
	
	
}
