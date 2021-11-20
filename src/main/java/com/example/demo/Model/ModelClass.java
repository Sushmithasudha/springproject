package com.example.demo.Model;

public class ModelClass {

	private String student_id;
	private String student_name;
	private String Age;

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public ModelClass(String student_id, String student_name, String age) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		Age = age;
	}

	public ModelClass() {
		super();
	}

}
