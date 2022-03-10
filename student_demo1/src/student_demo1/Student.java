package student_demo1;

public class Student {
	private int studentId;
	private String studentName;
	private float marks;
	private int yearOfEngg;
	private char residentialStatus;
	
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	public int getStudentId() {
		return studentId;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setMarks(float marks)
	{
		this.marks = marks;
	}
	public float getMarks()
	{
		return marks;
	}
	
	public void setYearOfEngg(int yearOfEngg)
	{
		this.yearOfEngg = yearOfEngg;
	}
	public int getYearOfEngg()
	{
		return yearOfEngg;
	}
	
	public char getResidentialStatus() 
	{
		return residentialStatus;
	}
	public void setResidentialStatus(char residentialStatus) 
	{
		this.residentialStatus = residentialStatus;
	}
	
	void displayDetails() {
		System.out.println("student name       : " + getStudentName());
		System.out.println("student id         : " + getStudentId());
		System.out.println("Qualifying marks   : " + getMarks());
		System.out.println("Residential status : " + getResidentialStatus());
		System.out.println("Year of Engg       : " + getYearOfEngg());
		System.out.println("\n");
	}

}
