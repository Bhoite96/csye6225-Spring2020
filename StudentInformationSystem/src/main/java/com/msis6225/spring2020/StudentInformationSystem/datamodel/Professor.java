package com.msis6225.spring2020.StudentInformationSystem.datamodel;

public class Professor {
	private String Id;
    private String professorId;
    private String firstName;
    private String lastName;
    private String department;
    private String joiningDate;

    public Professor() {

    }

    public Professor(String professorId, String firstName,
                     String lastName, String department, String joiningDate) {
        this.professorId = professorId;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.joiningDate = joiningDate;
    }

    public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getprofessorId() {
        return professorId;
    }

    public void setprofessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
    
    @Override
    public String toString() {
        return "Professor{" +
                "professorId=" + professorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", joiningDate='" + joiningDate + '\'' +
                '}';
    }
}