package com.in28minutes.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
//	data access object = Dao 
	
	// JPA/Hibernet > Database
	// UserDaoService > Staic list
	
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Eve", LocalDate.now().minusYears(25)));
		users.add(new User(3, "Jim", LocalDate.now().minusYears(20)));
	}
	
	public List<User> fingAll(){
		return users;
	}
	//public User save(User user);
	//public User fineOne(int id);

}
