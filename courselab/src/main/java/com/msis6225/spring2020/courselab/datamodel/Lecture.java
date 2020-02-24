package com.msis6225.spring2020.courselab.datamodel;

public class Lecture {
		private String id;
		private String lectureId;
		private String lectureName;
		private String assignments;
		private String notes;
		private String content;
		
		public Lecture() {
			
		}
		
		public Lecture(String lectureId, String lectureName, String assignments, String notes, String content) {
			this.lectureId = lectureId;
			this.lectureName = lectureName;
			this.assignments = assignments;
			this.notes = notes;
			this.content = content;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLectureId() {
			return lectureId;
		}

		public void setLectureId(String lectureId) {
			this.lectureId = lectureId;
		}

		public String getLectureName() {
			return lectureName;
		}

		public void setLectureName(String lectureName) {
			this.lectureName = lectureName;
		}

		public String getAssignments() {
			return assignments;
		}

		public void setAssignments(String assignments) {
			this.assignments = assignments;
		}

		public String getNotes() {
			return notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}
		
		@Override
		public String toString() {
			return "id =" + id
					+", notesUrl " + notes
					+", content " + content;
		}

}
