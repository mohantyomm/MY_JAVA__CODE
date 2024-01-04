package random_question_given.com;
import java.time.LocalDate;
import java.time.Period;
public class Age_finder {
	public static void main(String[] args) {
		String Birth_year = "1980 10 30" ;
		LocalDate dob = LocalDate.parse(Birth_year);
//		LocalDate currentdate=LocalDate.now();
//		int age =0;
//		if ((dob != null) && (currentdate != null))   
//		{  
//		age= Period.between(dob, currentdate).getYears();  
//		}  
//		System.out.println(age);
		System.out.println("You are " + calculateAge(dob)+" years old.");  
	}  
	//the method calculates the age  
	public static int calculateAge(LocalDate dob)   
	{  
	//creating an instance of the LocalDate class and invoking the now() method      
	//now() method obtains the current date from the system clock in the default time zone      
	LocalDate curDate = LocalDate.now();  
	//calculates the amount of time between two dates and returns the years  
	if ((dob != null) && (curDate != null))   
	{  
	return Period.between(dob, curDate).getYears();  
	}  
	else  
	{  
	return 0;  
	}  
	} 
	
}
