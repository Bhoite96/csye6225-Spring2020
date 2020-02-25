package com.msis6225.spring2020.StudentInformationSystem.resources;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.msis6225.spring2020.StudentInformationSystem.datamodel.Board;
import com.msis6225.spring2020.StudentInformationSystem.service.BoardsService;

//../webapi/myresource
@Path("boards")
public class BoardsResource {
		BoardsService boardsService = new BoardsService();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Board> getBoards() {
			return boardsService.getAllBoards();
		}
		
		//../webapi/boards/1
		@GET
		@Path("/{boardId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Board getBoard(@PathParam("boardId") String boardId) {
			System.out.println("Board Resource is Looking for " + boardId);
			return boardsService.getBoard(boardId);
		}
		
		@DELETE
		@Path("/{boardId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Board deleteBoard(@PathParam("boardId") String boardId) {
			return boardsService.deleteBoard(boardId);
		}
		
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Board addBoard(Board board) {
			return boardsService.addBoard(board);
		}
		
		@PUT
		@Path("/{boardId}")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Board updateBoard(@PathParam("boardId") String boardId,
				Board board) {
			return boardsService.updateBoardInformation(boardId, board);
		}
}
