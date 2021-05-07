package eticaretExample.core.abstracts;

public interface GoogleAuthService {

	void registerToSystem(String eMail,String password);
	void loginToSystem(String eMail,String password);
	
}
