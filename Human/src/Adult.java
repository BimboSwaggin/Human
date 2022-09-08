
public class Adult extends Human {
	
	String placeOfWork;	//(mutable)
	String occupation;	

	public Adult(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender, String placeOfWork, String occupation) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
		
		this.placeOfWork = placeOfWork;
		this.occupation = occupation;

	}
	
	String getPlaceOfWork() {
		return placeOfWork;
	}
	
	String getOccupation() {
		return occupation;
	}
	
	void setPlaceOfWork(String placeOfWork) {
		this.placeOfWork = placeOfWork;
	}
	
	void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
 
}
