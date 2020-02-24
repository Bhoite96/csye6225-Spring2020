package com.msis6225.spring2020.courselab.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.msis6225.spring2020.courselab.datamodel.InMemoryDatabase;
import com.msis6225.spring2020.courselab.datamodel.Lecture;

public class LecturesService {
	
	static HashMap<String, Lecture> lecture_Map = InMemoryDatabase.getLectureDB();
	
	public LecturesService() {
		
	}
	
	//Get list of all Lectures
	//../webapi/lectures
	public List<Lecture> getAllLectures() {	
		//Getting the list
		ArrayList<Lecture> list = new ArrayList<>();
		for (Lecture lecture : lecture_Map.values()) {
			list.add(lecture);
		}
		if (list.size() != 0) {
			System.out.println("All Available Lectures");
		} else {
			System.out.println("No Lectures Available");
		}
		return list ;
	}

	//Add a Lecture
	public Lecture addLecture(Lecture lecture) {
        // Next Id
        lecture_Map.put(lecture.getLectureId(), lecture);
		System.out.println("Lecture added");
		System.out.println(lecture.toString());
        return lecture;
    }
	
	//Get a Lecture
	public Lecture getLecture(String lectureId) {
		if (lecture_Map.containsKey(lectureId)) {
		 //Simple HashKey Load
		 Lecture lecture = lecture_Map.get(lectureId);
	     System.out.println("Lecture retrieved:");
	     System.out.println(lecture.toString());
		return lecture;
		} else {
			System.out.println("Lecture " + lectureId + " does not exist!!");
			return  null;
		}
	}
	
	//Delete a Lecture
	public Lecture deleteLecture(String lectureId) {
		if (lecture_Map.containsKey(lectureId)) {
			Lecture deletedLectureDetails = lecture_Map.get(lectureId);
			lecture_Map.remove(lectureId);
			System.out.println("Lecture deleted");
			System.out.println(deletedLectureDetails.toString());
			return deletedLectureDetails;
		} else {
			System.out.println("Lecture " + lectureId + "does not exist!!");
			return  null;
		}
	}
	
	//Update lecture Data
	public Lecture updateLectureInformation(String lectureId, Lecture lecture) {
		if (lecture_Map.containsKey(lectureId)) {
			lecture.setLectureId(lectureId);
			lecture_Map.put(lectureId, lecture);
			System.out.println("Lecture updated");
			System.out.println(lecture.toString());
		} else {
			System.out.println("Lecture data unavailable with " + lectureId);
		}
		return lecture;
	}
}
