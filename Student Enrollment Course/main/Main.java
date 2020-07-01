package edu.uog.main;

import java.util.List;
import java.util.Scanner;

import edu.uog.student.Student;
import edu.uog.student.studentData;



public class Main {
	
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

	
		studentData studentdata = new studentData();
		

		
		System.out.println("FindOne");
		Student student = studentdata.findOne(2);		
		System.out.println(student.toString());
		System.out.println("------------------------------------------------");
		
		
		System.out.println("FindAll");
		List<Student> students = studentData.findAll();
		
		for( int i=0; i<students.size(); i++) {
			
			System.out.println(students.get(i).toString());
		}
		System.out.println("-------------------------------------------------");
		
		
		System.out.println("Search");
		students = studentdata.search("Mehran");
		
		for( int i=0; i<students.size(); i++) {
			
			System.out.println(students.get(i).toString());
		}
		System.out.println("-------------------------------------------------");
		
		System.out.println("Save");

		student.setSTUDENT_NAME("Ali");
		student.setSTUDENT_ADDRESS("Jhelum");
		student.setSTUDENT_GENDER("Male");
		student.setSTUDENT_DOB("7/5/2000");
		student.setSTUDENT_EMAIL("abf@gmail.com");
		student.setSTUDENT_MOBILENO("01234567899");
		
		student = studentdata.Save(student);
		System.out.println(student.toString());
		System.out.println("-------------------------------------------------");
		

		System.out.println("FindAll");
		students = studentdata.findAll();
	
		for( int i=0; i<students.size(); i++) {
		
		System.out.println(students.get(i).toString());
		}
		System.out.println("-------------------------------------------------");
		
		System.out.println("Delete Student");
		System.out.println("---------------------------------");
		System.out.println("Enter Student ID: ");
		
		int delete = scan.nextInt();
		Student student1 = studentData.delete(delete);
		System.out.println(student1.toString());
		
		

		
////////////////////////////////////////////////////////////////////////////////////////////////		
/*
		courseData coursedata = new courseData();	
		
		
		System.out.println("FindOne");
		Course course = coursedata.findOne(1);		
		System.out.println(course.toString());
		System.out.println("------------------------------------------------");
		
		
		System.out.println("FindAll");
		List<Course> courses = coursedata.findAll();
		
		for( int i=0; i<courses.size(); i++) {
			
			System.out.println(courses.get(i).toString());
		}
		System.out.println("-------------------------------------------------");
		
		
		
		System.out.println("Search");
		courses = courseData.search("CS-");
		
		for( int i=0; i<courses.size(); i++) {
			
			System.out.println(courses.get(i).toString());
		}
		System.out.println("-------------------------------------------------");
		
		System.out.println("Save");
	
	
		course.setCOURSE_CODE("155");
		course.setCOURSE_TITLE("Physics");
		course.setCOURSE_DESC("It is physics course");
		course.setCOURSE_CREDITHOUR(3);
		
		course = coursedata.Save(course);
		System.out.println(course.toString());
		System.out.println("-------------------------------------------------");
		

		System.out.println("FindAll");
		courses = coursedata.findAll();
	
		for( int i=0; i<courses.size(); i++) {
		
		System.out.println(courses.get(i).toString());
		}
		System.out.println("-------------------------------------------------");

*/
	}

}
