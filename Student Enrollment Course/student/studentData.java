package edu.uog.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class studentData {


	
	public static List<Student> findAll() {
		List<Student> students = new ArrayList<Student>();
		String line;
		
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferreader = new BufferedReader(new FileReader(Student.csvFile));
			
			while ((line =  bufferreader.readLine()) != null){
				Student student = new Student();
				
				String[] studentRow = line.split(",");
				
				student.setSTUDENT_ID(Integer.parseInt(studentRow[0]));
				student.setSTUDENT_NAME(studentRow[1]);
				student.setSTUDENT_GENDER(studentRow[2]);
				student.setSTUDENT_DOB(studentRow[3]);
				student.setSTUDENT_EMAIL(studentRow[4]);
				student.setSTUDENT_MOBILENO(studentRow[5]);
				
				
				students.add(student);
				
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return students;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static Student findOne(int STUDENT_ID) {
		
		String line;
		
		try {
			
			BufferedReader bufferreader = new BufferedReader(new FileReader(Student.csvFile));
			
			while ((line =  bufferreader.readLine()) != null){
				Student student = new Student();
				
				String[] studentRow = line.split(",");
				
				if(Integer.parseInt(studentRow[0]) == STUDENT_ID) {
				
					student.setSTUDENT_NAME(studentRow[1]);
					student.setSTUDENT_GENDER(studentRow[2]);
					student.setSTUDENT_DOB(studentRow[3]);
					student.setSTUDENT_EMAIL(studentRow[4]);
					student.setSTUDENT_MOBILENO(studentRow[5]);

					
				return student;
				}
				
				
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	public static List<Student> search(String search) {
		List<Student> students = new ArrayList<Student>();
		String line;
		
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferreader = new BufferedReader(new FileReader(Student.csvFile));
			
			while ((line =  bufferreader.readLine()) != null){
				Student student = new Student();
				
				String[] studentRow = line.split(",");
				
				if (studentRow[1].contains(search) == true) {
					

					student.setSTUDENT_ID(Integer.parseInt(studentRow[0]));
					student.setSTUDENT_NAME(studentRow[1]);
					student.setSTUDENT_GENDER(studentRow[2]);
					student.setSTUDENT_DOB(studentRow[3]);
					student.setSTUDENT_EMAIL(studentRow[4]);
					student.setSTUDENT_MOBILENO(studentRow[5]);
	
					
				
				students.add(student);
				
			}
		}
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return students;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	public static Student Save(Student student) {
			
		FileWriter filewriter;
		
		List<Student> students = findAll();
		
		
		
		
		try {
			filewriter = new FileWriter(Student.csvFile);
			
			for( int i=0; i<students.size(); i++) {
				
				filewriter.append(students.get(i).toString());
				filewriter.append("\n");
				
			}
				
			if (students.size()>0) 
				
			
			{	student.setSTUDENT_ID(students.get(students.size()-1).getSTUDENT_ID()+1); }
		
		else 
			{student.setSTUDENT_ID(1);}
		
			filewriter.append(student.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return student;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////


	@SuppressWarnings("unused")
	public static Student delete(int STUDENT_ID) {
		


		FileWriter filewriter;
		List<Student> students = findAll();
		Student student = studentData.findOne(STUDENT_ID);
		try 
		{
			filewriter = new FileWriter(Student.csvFile);
			for(int i=0;i<students.size();i++) 
			{
				if(students.get(i).getSTUDENT_ID()!=STUDENT_ID)
				{
					filewriter.append(students.get(i).toString());
					filewriter.append("\n");
				}
			}
			    filewriter.flush();
				filewriter.close();
	    } 
		catch (IOException e) 
		{   
			System.out.println("CSV File not Found!" +e);  
			e.printStackTrace();    
		}
		return student;
	}

	}


