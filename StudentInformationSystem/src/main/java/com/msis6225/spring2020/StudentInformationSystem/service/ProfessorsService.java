package com.msis6225.spring2020.StudentInformationSystem.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.msis6225.spring2020.StudentInformationSystem.datamodel.InMemoryDatabase;
import com.msis6225.spring2020.StudentInformationSystem.datamodel.Professor;

public class ProfessorsService {

    static HashMap<String, Professor> prof_Map = InMemoryDatabase.getProfessorDB();

    public ProfessorsService() {
    }

    // Getting a list of all professor
    // GET "..webapi/professors"
    public List<Professor> getAllProfessors() {
        //Getting the list
        ArrayList<Professor> list = new ArrayList<>();
        for (Professor prof : prof_Map.values()) {
            list.add(prof);
        }
        if(list.size() != 0) {
        	System.out.println("Professors list is upto date");
        }else {
        	System.out.println("Professors list is empty");
        }
        return list ;
    }

//    // Adding a professor
//    public Professor addProfessor(String firstName, String lastName, String department, Date joiningDate) {
//        // Next Id
//        return addProfessor(new Professor(firstName, lastName,
//                department, joiningDate.toString()));
//    }

    public Professor addProfessor(Professor prof) {
        prof_Map.put(prof.getprofessorId(), prof);
        System.out.println("Professor has been added");
        System.out.println(prof.toString());
        return prof;
    }


    // Getting One Professor
    public Professor getProfessor(String profId) {
    	if(prof_Map.containsKey(profId)) {
        //Simple HashKey Load
        Professor prof2 = prof_Map.get(profId);
        System.out.println("Item retrieved:");
        System.out.println(prof2.toString());
        return prof2;
    	}else {
    		System.out.println("Professor" + profId +"does not exist!");
    		return null;
    	}
    }

    // Deleting a professor
    public Professor deleteProfessor(String profId) {
    	if(prof_Map.containsKey(profId)) {
        Professor deletedProfDetails = prof_Map.get(profId);
        prof_Map.remove(profId);
        System.out.println("Professor Deleted!");
        System.out.println(deletedProfDetails.toString());
        return deletedProfDetails;
    	}else {
    		System.out.println("Professor "+ profId + "does not exist!");
    		return null;
    	}
    }

    // Updating Professor Info
    public Professor updateProfessorInformation(String profId, Professor prof) {
    	if(prof_Map.containsKey(profId)) {
        	prof.setprofessorId(profId);
        	prof_Map.put(profId, prof);
        	System.out.println("Professor Updated!");
        	System.out.println(prof.toString());
    	}else {
    		System.out.println("Professor not available with professorId "+profId );
    	}
    	return prof;
    }

    // Get professors in a department
//    public List<Professor> getProfessorsByDepartment(String department) {
//        //Getting the list
//        return prof_Map.values().stream()
//                .filter(prof -> department.equals(prof.getDepartment())).collect(Collectors.toList());
//    }
    
    public List<Professor> getProfessorsByDepartment(String department) {	
		//Getting the list
		ArrayList<Professor> list = new ArrayList<>();
		for (Professor prof : prof_Map.values()) {
			if (prof.getDepartment().equals(department)) {
				list.add(prof);
			}
		}
		return list ;
	}

    // Get professors for a year with a size limit

}
