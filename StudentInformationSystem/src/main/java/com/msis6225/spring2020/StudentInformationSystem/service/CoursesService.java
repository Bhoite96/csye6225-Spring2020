package com.msis6225.spring2020.StudentInformationSystem.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.msis6225.spring2020.StudentInformationSystem.datamodel.Course;
import com.msis6225.spring2020.StudentInformationSystem.datamodel.InMemoryDatabase;

public class CoursesService {
		static HashMap<String, Course> course_Map = InMemoryDatabase.getCourseDB();
		
		public CoursesService() {
			
		}
		
		//Get List of all Courses
		//../webapi/courses
		public List<Course> getAllCourses(){
			//Get List of Courses
			List<Course> list = new ArrayList<>();
			for(Course course : course_Map.values()) {
				list.add(course);
			}
			if(list.size() != 0) {
				System.out.println("Courses Available");
			}else {
				System.out.println("No course data");
			}
			return list;
		}
		
		//Add a Course
		public Course addCourse(Course course) {
		    course_Map.put(course.getCourseId(), course);
			System.out.println("Course Added");
			System.out.println(course.toString());
		    return course;
		}
		
		//Get a Course
		public Course getCourse(String courseId) {
			if (course_Map.containsKey(courseId)) {
			 //Simple HashKey Load
			 Course course = course_Map.get(courseId);
		     System.out.println("Course Retrieved:");
		     System.out.println(course.toString());
			return course;
			} else {
				System.out.println("Course " + courseId + " does not exist!!");
				return null;
			}
		}
		
		//Delete a Course
		public Course deleteCourse(String courseId) {
			if (course_Map.containsKey(courseId)) {
				Course deletedCourseDetails = course_Map.get(courseId);
				course_Map.remove(courseId);
				System.out.println("Course deleted:");
				System.out.println(deletedCourseDetails.toString());
				return deletedCourseDetails;
			} else {
				System.out.println("Course " + courseId + "does not exist!!");
				return null;
			}
		}
		
		//Update Course Data
		public Course updateCourseInformation(String courseId, Course course) {
			if (course_Map.containsKey(courseId)) {
				course.setCourseId(courseId);
				course_Map.put(courseId, course);
				System.out.println("Course updated:");
				System.out.println(course.toString());
			} else {
				System.out.println("Cannot find Course with " + courseId);
			}
			return course;
		}
}
