package com.msis6225.spring2020.StudentInformationSystem.resources;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.msis6225.spring2020.StudentInformationSystem.datamodel.Program;
import com.msis6225.spring2020.StudentInformationSystem.service.ProgramsService;

//../webapi/myresource
@Path("programs")
public class ProgramsResource {
		ProgramsService programsService = new ProgramsService();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Program> getPrograms() {
			return programsService.getAllPrograms();
		}
		
		//..webapi/program/1
		@GET
		@Path("/{programId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Program getProgram(@PathParam("programId") String programId) {
			System.out.println("Program Resource is Looking for " + programId);
			return programsService.getProgram(programId);
		}
		
		@DELETE
		@Path("/{programId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Program deleteProgram(@PathParam("programId") String programId) {
			return programsService.deleteProgram(programId);
		}
		
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Program addProgram(Program program) {
			return programsService.addProgram(program);
		}
		
		@PUT
		@Path("/{programId}")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Program updateProgram(@PathParam("programId") String programId,
				Program program) {
			return programsService.updateProgramInformation(programId, program);
		}
}
