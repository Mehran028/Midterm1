package edu.uog.student;

public class Student {
	

	public static  String csvFile = "D:\\OOP\\Student.csv";
	
	private int STUDENT_ID;
	
	private String STUDENT_NAME;
	
	private String STUDENT_ADDRESS;
	
	private String STUDENT_GENDER;
	
	private String STUDENT_DOB;
	
	private String STUDENT_EMAIL;
	
	private String STUDENT_MOBILENO;
	
	
	
	
	
		public static String getCsvFile() {
		return csvFile;
	}


	public static void setCsvFile(String csvFile) {
		Student.csvFile = csvFile;
	}


	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}


	public void setSTUDENT_ID(int sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}


	public String getSTUDENT_NAME() {
		return STUDENT_NAME;
	}


	public void setSTUDENT_NAME(String sTUDENT_NAME) {
		STUDENT_NAME = sTUDENT_NAME;
	}


	public String getSTUDENT_ADDRESS() {
		return STUDENT_ADDRESS;
	}


	public void setSTUDENT_ADDRESS(String sTUDENT_ADDRESS) {
		STUDENT_ADDRESS = sTUDENT_ADDRESS;
	}


	public String getSTUDENT_GENDER() {
		return STUDENT_GENDER;
	}


	public void setSTUDENT_GENDER(String sTUDENT_GENDER) {
		STUDENT_GENDER = sTUDENT_GENDER;
	}


	public String getSTUDENT_DOB() {
		return STUDENT_DOB;
	}


	public void setSTUDENT_DOB(String sTUDENT_DOB) {
		STUDENT_DOB = sTUDENT_DOB;
	}


	public String getSTUDENT_EMAIL() {
		return STUDENT_EMAIL;
	}


	public void setSTUDENT_EMAIL(String sTUDENT_EMAIL) {
		STUDENT_EMAIL = sTUDENT_EMAIL;
	}


	public String getSTUDENT_MOBILENO() {
		return STUDENT_MOBILENO;
	}


	public void setSTUDENT_MOBILENO(String sTUDENT_MOBILENO) {
		STUDENT_MOBILENO = sTUDENT_MOBILENO;
	}


		public String toString() {
			
			String str = null;
			
			str = this.STUDENT_ID
					+"," + this.STUDENT_NAME
					+"," + this.STUDENT_ADDRESS
					+"," + this.STUDENT_GENDER
					+"," + this.STUDENT_DOB
					+"," + this.STUDENT_EMAIL
					+"," + this.STUDENT_MOBILENO;
			
			
			return str;
			
			
			
		}

	}


	
	


