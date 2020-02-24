package com.msis6225.spring2020.courselab.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.msis6225.spring2020.courselab.datamodel.Board;
import com.msis6225.spring2020.courselab.datamodel.InMemoryDatabase;

public class BoardsService {
		
		static HashMap<String, Board> board_Map = InMemoryDatabase.getBoardDB();
		
		public BoardsService() {
			
		}
		
		//Get all boards
		public List<Board> getAllBoards() {	
			//Getting the list
			ArrayList<Board> list = new ArrayList<>();
			for (Board board : board_Map.values()) {
				list.add(board);
			}
			if (list.size() != 0) {
				System.out.println("All Available Boards");
			} else {
				System.out.println("No Boards are Available");
			}
			return list ;  
		}
		
		//Get one course
		public Board getBoard(String boardId) {
			if (board_Map.containsKey(boardId)) {
				 //Simple HashKey Load
				Board board = board_Map.get(boardId);
				System.out.println("Board retrieved:");
				System.out.println(board.toString());
				return board;
			} else {
				System.out.println("Board unavailable with "+boardId);
				return null;
			}
		}
		
		//Add a new Board
		public Board addBoard(Board board) {
			 Board newBoard = new Board(board.getBoardId(), board.getBoardName(),board.getCourseId());
		     board_Map.put(board.getBoardId(), newBoard);	
			 System.out.println("Board added");
		     System.out.println(newBoard.toString());
			 return newBoard;
		}
		
		//Delete a Board
		public  Board deleteBoard(String boardId) {
			if (board_Map.containsKey(boardId)) {
				Board deletedBoardDetails = board_Map.get(boardId);
				board_Map.remove(boardId);
				System.out.println("Board deleted");
				System.out.println(deletedBoardDetails.toString());
				return deletedBoardDetails;
			} else {
				System.out.println("Board unavailable with " + boardId );
				return null;
			}
		}
		
		//Update Board Data
		public Board updateBoardInformation(String boardId, Board board) {
			if (board_Map.containsKey(boardId)) {
				board.setBoardId(boardId);
				board_Map.put(boardId, board);
				System.out.println("Board updated:");
				System.out.println(board.toString());
			} else {
				System.out.println("Board unavailable with " + boardId);
			}
			return board;
		}
}
