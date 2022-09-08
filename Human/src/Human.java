import java.time.LocalDate;
import java.time.Period;

public class Human {
	
	int birthYear; 		// (immutable)
	int birthMonth;		// (immutable)
	int birthDay;		// (immutable)
	String firstName;	// (mutable)
	String lastName;	// (mutable)
	Gender gender; 		// (mutable)
	
	
	public Human(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender) {
		
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.gender = gender;
		
		
		
	}
	
	// ACCESSORS
	
	int getBirthYear() {
		return birthYear;
	}
	
	int getBirthMonth() {
		return birthMonth;
	}

	int getBirthDay() {
		return birthDay;
	}
	
	
	
	String getFirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}

	
	
	Gender getGender() {
		return gender;
	}
	
	
	
	// MUTATORS
	
	void setFirstName(String newName) {
		firstName = newName;;
	}
	
	void setLastName(String newName) {
		lastName = newName;
	}
	
	
	
	int calculateCurrentAgeInYears() {
		LocalDate currentDate = LocalDate.now();
		LocalDate dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);
		
		Period period = Period.between(dateOfBirth, currentDate);
		int age = period.getYears();
		
		return age;
		
		
		
	}
}
