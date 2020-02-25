package com.msis6225.spring2020.StudentInformationSystem.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.msis6225.spring2020.StudentInformationSystem.datamodel.InMemoryDatabase;
import com.msis6225.spring2020.StudentInformationSystem.datamodel.Student;

public class StudentsService {
	static HashMap<String, Student> student_Map = InMemoryDatabase.getStudentDB();
	
	// Get List of All Students
	public List<Student> getAllStudents() {
		List<Student> list = new ArrayList<>();
		for(Student student : student_Map.values()) {
			list.add(student);
		}
		if(list.size() != 0) {
			System.out.println("All Students Retrived");
		}else {
			System.out.println("No Students data!");
		}
		return list;
	}
	
	// Add a Student
	public Student addStudent(Student student) {
		student_Map.put(student.getStudentId(), student);
			System.out.println("Student Added");
			System.out.println(student.toString());
		return student;
	}
	
	// Get a Student
	public Student getStudent(String studentId) {
		if(student_Map.containsKey(studentId)) {
			Student student = student_Map.get(studentId);
			System.out.println("Student Retrieved");
			System.out.println(student.toString());
			return student;
		}else {
			System.out.println("Student " +studentId + "does not exist!");
			return null;
		}
	}
	
	// Delete a Student
	public Student deleteStudent(String StudentId) {
		if(student_Map.containsKey(StudentId)) {
			Student student = student_Map.get(StudentId);
			student_Map.remove(StudentId);
			System.out.println("Student Deleted");
			System.out.println(student.toString());
			return student;
		}else {
			System.out.println("Student unavailable with StudentId =" + StudentId);
		}
		return null;
	}
	
	//Updating Student Data
	public Student updateStudentInformation(String studentId, Student student) {
		if(student_Map.containsKey(studentId)) {
			student.setStudentId(studentId);
			student_Map.put(studentId, student);
			System.out.println("Student Updated!");
			System.out.println(student.toString());
		}else {
			System.out.println("Student unavailable with StudentId ="+studentId);
		}
		return student;
	}
	
	//Update Student EmailId
	public Student updateStudentEmailId(String studentId, String EmailId) {
		Student student = student_Map.get(studentId);
		student.setEmailId(EmailId);
		return student;
	}
	
	//Get Student Enrolled in Program
	public List<Student> getStudentsByProgram(String program){
		List<Student> students = new ArrayList<>();
		for(Student student : student_Map.values()) {
			if(student.getProgramName().equals(program)) {
				System.out.print(student.getStudentId());
				students.add(student);
			}
		}
		return students;
	}
}
