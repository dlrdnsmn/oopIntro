package eticaretExample.business.abstracts;

import eticaretExample.entities.concretes.User;

public interface AuthService {

	void register(User user);
	void login(String eMail,String password);
	
}
