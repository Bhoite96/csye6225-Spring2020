package com.msis6225.spring2020.StudentInformationSystem.datamodel;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String id;
	private String studentId;
	private String firstName;
	private String lastName;
	private String imageUrl;
	private String programName;
	private String emailId;
	private List<String> courseEnrolled = new ArrayList<>();
	
	public Student() {
	}
	
	public Student(String studentId, String firstName, String lastName, 
			String imageUrl, String programName, String emailId) {
		this.setStudentId(studentId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setImageUrl(imageUrl);
		this.setProgramName(programName);
		this.setEmailId(emailId);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<String> getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(List<String> courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	
	@Override
	public String toString() {
		return "studentId = " + studentId 
				+ ", firstName = " + firstName
				+ ", lastName = " + lastName
				+ ", programName = " + programName
				+ ", imageUrl = " + imageUrl
				+ ", emailId = " + emailId;
	}
	
}
