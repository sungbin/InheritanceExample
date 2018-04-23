package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person{
	private int facultyNumber;
	
	public Faculty()    { 
		super();        
		facultyNumber = 1;  
	} 

	public Faculty(String initialName, int facultyNumber) { 
		super(initialName);        
		setFacultyNumber(facultyNumber); 
	}

	public int getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(int facultyNumber) {
		this.facultyNumber = facultyNumber;
	}
	
	public void reset(String newName, int newFacultyNumber) {
		super.setName(newName);
		setFacultyNumber(newFacultyNumber);
	}
	
	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Faculty Number: " + facultyNumber); 
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + facultyNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		if (facultyNumber != other.facultyNumber)
			return false;
		return true;
	}
		

}
