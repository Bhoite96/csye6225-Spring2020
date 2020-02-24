package com.msis6225.spring2020.courselab.resources;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.msis6225.spring2020.courselab.datamodel.Lecture;
import com.msis6225.spring2020.courselab.service.LecturesService;

//../webapi/myresource
@Path("lectures")
public class LecturesResource {
		LecturesService lecturesServices = new LecturesService();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Lecture> getLectures() {
			return lecturesServices.getAllLectures();
		}
		
		//../webapi/lecture/1
		@GET
		@Path("/{lectureId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Lecture getLecture(@PathParam("lectureId") String lectureId) {
			System.out.println("lecture Resource is Looking for " + lectureId);
			return lecturesServices.getLecture(lectureId);
		}
		
		@DELETE
		@Path("/{lectureId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Lecture deleteLecture(@PathParam("lectureId") String lectureId) {
			return lecturesServices.deleteLecture(lectureId);
		}
		
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Lecture addLecture(Lecture lecture) {
			return lecturesServices.addLecture(lecture);
		}
		
		@PUT
		@Path("/{lectureId}")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Lecture updateLecture(@PathParam("lectureId") String lectureId,
				Lecture lecture) {
			return lecturesServices.updateLectureInformation(lectureId, lecture);
		}
}
