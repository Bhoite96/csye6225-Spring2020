package com.msis6225.spring2020.StudentInformationSystem.datamodel;

public class Board {
		private String Id;
		private String boardId;
		private String boardName;
		private String courseId;
		
		public Board() {
			
		}
		
		public Board(String boardId, String boardName, String courseId) {
			this.setBoardId(boardId);
			this.setBoardName(boardName);
			this.setCourseId(courseId);
		}

		public String getId() {
			return Id;
		}

		public void setId(String id) {
			Id = id;
		}

		public String getBoardId() {
			return boardId;
		}

		public void setBoardId(String boardId) {
			this.boardId = boardId;
		}

		public String getBoardName() {
			return boardName;
		}

		public void setBoardName(String boardName) {
			this.boardName = boardName;
		}

		public String getCourseId() {
			return courseId;
		}

		public void setCourseId(String courseId) {
			this.courseId = courseId;
		}
		
		@Override
		public String toString() {
			return "boardId =" +boardId
					+ ", board Name = " +boardName
					+ ", course Id = " +courseId;
		}
}
