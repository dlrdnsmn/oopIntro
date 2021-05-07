package eticaretExample.business.abstracts;

import eticaretExample.entities.concretes.User;

public interface UserService {

	void add(User user);
	void delete(User user);
	void update(User user);
	void login(String eMail, String password);
	
}
