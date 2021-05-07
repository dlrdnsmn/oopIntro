package eticaretExample;

import eticaretExample.business.abstracts.AuthService;
import eticaretExample.business.concretes.AuthManager;
import eticaretExample.business.concretes.EMailVerificationManager;
import eticaretExample.business.concretes.UserManager;
import eticaretExample.core.abstracts.GoogleAuthService;
import eticaretExample.core.concretes.GoogleAuthManagerAdapter;
import eticaretExample.dataAccess.concretes.HibernateUserDao;
import eticaretExample.entities.concretes.User;

public class Main {

public static void main(String[] args) {

		
		User user=new User(1,"a","b","15253545d.","dilara123@gmail.com");
		
		AuthService authService=new AuthManager(new EMailVerificationManager(), new UserManager(new HibernateUserDao()));
        authService.register(user);
        System.out.println("------");
        
        
        GoogleAuthService googleAuthService=new GoogleAuthManagerAdapter();
        googleAuthService.registerToSystem("dilara123@gmail.com", "D1234");
        System.out.println("------");
     

	}
}
