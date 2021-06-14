package TestingSystem_Assignment_3;
import java.util.Date;
import java.util.LocalDate;

public class Account {
int id ;
String email;
String fullName;
Date createDate;

public Account(int id, String email, String firstName, String lastName, Date createDate) {
this.fullName = firstName + " " + lastName;
this.createDate = new Date();
	
}


	
}
