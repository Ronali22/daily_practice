package com.InterviewPractice;

import java.util.ArrayList;

class Student {

	private String studentName;
	private Integer studentAge;

	public Student(String studentName, Integer studentAge) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

}

public class Collection_Crud_Example {
	public static void main(String[] args) {
		Student s1 = new Student("ram",15);
		Student s2 = new Student("hari",16);
		Student s3 = new Student("shyam",15);
		Student s4 = new Student("gopal",17);
		
		ArrayList<Student> studentList = new ArrayList<>();
//		insertion/create operation
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
//		read operation
		System.out.println(studentList.get(2));//shyam,15
		
//		update operation
		System.out.println(studentList.get(3));//gopal,17
		studentList.remove(3);
		Student newStudent = new Student("raju",16);
		studentList.add(3, newStudent);
		
//		delete operation
		studentList.remove(0);
		
//		final students present
		System.out.println(studentList);
	}

}
