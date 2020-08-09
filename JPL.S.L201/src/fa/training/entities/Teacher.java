package fa.training.entities;

public abstract class Teacher {
private String designation;
private String collegeName;
public Teacher() {
	
}
public Teacher(String designation, String collegeName) {
	super();
	this.designation=designation;
	this.collegeName=collegeName;
}
public String getDesignation() {
	return designation;
}
public void setDesigantion(String designation) {
	this.designation=designation;
}
public String getCollegename() {
	return collegeName;
}
public void setCollegename(String collegename) {
	this.collegeName=collegeName;
}
public abstract void teach();
	public void teach(int duration) {
		System.out.println("Teaching in " + duration +" minutes");
}
}
