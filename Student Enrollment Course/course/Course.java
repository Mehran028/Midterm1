package edu.uog.course;

public class Course {
	

	
	public static   String csvFile1 = "D:\\OOP\\Course1.csv";
	
	private int COURSE_ID;
	
	private String COURSE_CODE;
	
	private String COURSE_TITLE;
	
	private String COURSE_DESC;
	
	private int COURSE_CREDITHOUR;

	//private Course COURSEPREREQUIST_ID;

	
	
	
	


	public static String getCsvFile1() {
		return csvFile1;
	}

	public static void setCsvFile1(String csvFile1) {
		Course.csvFile1 = csvFile1;
	}
/*
	public Course getCOURSEPREREQUIST_ID() {
		return COURSEPREREQUIST_ID;
	}

	public void setCOURSEPREREQUIST_ID(Course cOURSEPREREQUIST_ID) {
		COURSEPREREQUIST_ID = cOURSEPREREQUIST_ID;
	}
*/
	public static String getCsvFile() {
		return csvFile1;
	}

	public static void setCsvFile(String csvFile) {
		Course.csvFile1 = csvFile;
	}

	public int getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(int cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public String getCOURSE_CODE() {
		return COURSE_CODE;
	}

	public void setCOURSE_CODE(String cOURSE_CODE) {
		COURSE_CODE = cOURSE_CODE;
	}

	public String getCOURSE_TITLE() {
		return COURSE_TITLE;
	}

	public void setCOURSE_TITLE(String cOURSE_TITLE) {
		COURSE_TITLE = cOURSE_TITLE;
	}

	public String getCOURSE_DESC() {
		return COURSE_DESC;
	}

	public void setCOURSE_DESC(String cOURSE_DESC) {
		COURSE_DESC = cOURSE_DESC;
	}

	public int getCOURSE_CREDITHOUR() {
		return COURSE_CREDITHOUR;
	}

	public void setCOURSE_CREDITHOUR(int cOURSE_CREDITHOUR) {
		COURSE_CREDITHOUR = cOURSE_CREDITHOUR;
	}

	

	
public String toString() {
		
		String str = null;
		
		str = this.COURSE_ID
				+"," + this.COURSE_CODE
				+"," + this.COURSE_TITLE
				+"," + this.COURSE_CREDITHOUR
				+"," + this.COURSE_DESC;
		
		
		return str;
		
		
		
	}
	



}
