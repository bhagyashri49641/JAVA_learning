package student_demo1;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println("Hello");
		Student student =new Student();
		Student student1 = new Student();
		
		student.setStudentName("Bhagyashri");
		student.setMarks(90);
		student.setStudentId(1);
		student.setResidentialStatus('D');
		student.setYearOfEngg(4);
		
		student1.setStudentName("Nayan");
		student1.setMarks(92);
		student1.setStudentId(2);
		student1.setResidentialStatus('H');
		student1.setYearOfEngg(2);
		
		student.displayDetails();
		student1.displayDetails();
		
		/*
		System.out.println("student name       : " + student.getStudentName());
		System.out.println("student id         : " + student.getStudentId());
		System.out.println("Qualifying marks   : " + student.getMarks());
		System.out.println("Residential status : " + student.getResidentialStatus());
		System.out.println("Year of Engg       : " + student.getYearOfEngg());
		 */

	}

}
