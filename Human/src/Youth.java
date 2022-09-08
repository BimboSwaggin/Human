
public class Youth extends Human {
	
	int schoolGrade;	//(mutable)
	String schoolName; 	//(mutable)

	public Youth(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender, int schoolGrade, String schoolName) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
		
		this.schoolGrade = schoolGrade;
		this.schoolName = schoolName;
	}
	
	String getSchoolName() {
		return schoolName;
	}
	
	int getSchoolGrade() {
		return schoolGrade;
	}
	
	void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	void setSchoolGrade(int schoolGrade) {
		this.schoolGrade = schoolGrade;
	}

	
	

}
