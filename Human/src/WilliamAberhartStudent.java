
public class WilliamAberhartStudent extends Youth{
	
	int HomeRoom; 			// (mutable)
	String HomeRoomTeacher;	// (mutable)
	String schoolName;		// (immutable)

	public WilliamAberhartStudent(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender, 
			int schoolGrade, int HomeRoom, String HomeRoomTeacher) {
		
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender, schoolGrade, "William Aberhart High School");
		
		this.HomeRoom = HomeRoom;
		this.HomeRoomTeacher = HomeRoomTeacher;
		
	}
	
	int getHomeRoom() {
		return HomeRoom;
	}
	
	String getHomeRoomTeacher() {
		return HomeRoomTeacher;
	}
	
	@Override 
	void setSchoolName(String schoolName) {
		throw new UnsupportedOperationException("Can't change School Name");
	}
	
	
	


}
