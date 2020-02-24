package com.msis6225.spring2020.courselab.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.msis6225.spring2020.courselab.datamodel.InMemoryDatabase;
import com.msis6225.spring2020.courselab.datamodel.Program;

public class ProgramsService {
	
	static HashMap<String, Program> program_Map = InMemoryDatabase.getProgramDB();
	
	public ProgramsService() {
		
	}
	
	//Get list of all Programs
	//../webapi/programs
	public List<Program> getAllPrograms(){
		//Getting the List
		ArrayList<Program> list = new ArrayList<>();
		for(Program program : program_Map.values()) {
			list.add(program);
		}
		if(list.size() != 0 ) {
			System.out.println("All Available Programs ");
		}else {
			System.out.println("No Available Programs ");
		}
		return list;
	}
	
	//Add a Program
	public Program addProgram(Program program) {
        // Next Id
		Program newProgram = new Program(program.getProgramId(), program.getProgramName());
		String programId = program.getProgramId();
        program_Map.put(programId, newProgram);
		System.out.println("Program added");
        return newProgram;
    }
	
	//Getting a Program
	public Program getProgram(String programId) {
		 //Simple HashKey Load
		if(program_Map.containsKey(programId)) {
			Program program = program_Map.get(programId);
			System.out.println("Program retrieved:");
			System.out.println(program.toString());
		return program;
		} else {
			System.out.println("Program " + programId + " does not exist!!!");
			return null;
		}
	}
	
	//Delete a Program
	public Program deleteProgram(String programId) {
		if(program_Map.containsKey(programId)) {
			Program deletedProgramDetails = program_Map.get(programId);
			program_Map.remove(programId);
			System.out.println("Program deleted");
			System.out.println(deletedProgramDetails.toString());
			return deletedProgramDetails;
		} else {
			System.out.println("Program " + programId + " does not exist!!!");
			return null;
		}
	}
	
	//Update a Program
	public Program updateProgramInformation(String programId, Program program) {
		if(program_Map.containsKey(programId)) {
			program.setProgramId(programId);
			program_Map.put(programId,program);
			System.out.println("Program updated:");
			System.out.println(program.toString());
		} else {
			System.out.println("Program unavailable data with" + programId);
		}
		return program;
	}

}
