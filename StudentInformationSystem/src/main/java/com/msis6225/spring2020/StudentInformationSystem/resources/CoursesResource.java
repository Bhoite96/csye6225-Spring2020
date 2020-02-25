package com.msis6225.spring2020.StudentInformationSystem.resources;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.msis6225.spring2020.StudentInformationSystem.datamodel.Course;
import com.msis6225.spring2020.StudentInformationSystem.service.CoursesService;

//../webapi/myresource
@Path("courses")
public class CoursesResource {
		CoursesService coursesService = new CoursesService();

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Course> getCourses() {
			return coursesService.getAllCourses();
		}
		
		//../webapi/course/1
		@GET
		@Path("/{courseId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Course getCourse(@PathParam("courseId") String courseId) {
			System.out.println("Course Resource is Looking for: " + courseId);
			return coursesService.getCourse(courseId);
		}
		
		@DELETE
		@Path("/{courseId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Course deleteCourse(@PathParam("courseId") String courseId) {
			return coursesService.deleteCourse(courseId);
		}

		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Course addCourse(Course course) {
			return coursesService.addCourse(course);
		}
		
		@PUT
		@Path("/{courseId}")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Course updateCourse(@PathParam("courseId") String courseId,
				Course course) {
			return coursesService.updateCourseInformation(courseId, course);
		}

}
