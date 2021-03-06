package com.msis6225.spring2020.StudentInformationSystem.datamodel;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String id;
	private String courseId;
	private String courseName;
	private String professorId;
	private String taId;
	private String boardId;
	private List<String> enrolledStudents = new ArrayList<String>();
	private List<String> lectures = new ArrayList<String>();

	public Course() {
		
	}
	
	public Course(String courseId, String courseName, String professorId, String taId) {
		this.setCourseId(courseId);
		this.setCourseName(courseName);
		this.setProfessorId(professorId);
		this.setTaId(taId); 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getProfessorId() {
		return professorId;
	}

	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}

	public String getTaId() {
		return taId;
	}

	public void setTaId(String taId) {
		this.taId = taId;
	}

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public List<String> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(List<String> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public List<String> getLectures() {
		return lectures;
	}

	public void setLectures(List<String> lectures) {
		this.lectures = lectures;
	}
	
	@Override
	public String toString() {
		return "Course{ "
				+ "courseId ="+courseId
				+ ", courseName =" +courseName
				+ ", professorId =" +professorId
				+ ", taId =" +taId
				+ "}";
	}
}