package eticaretExample.business.concretes;

import eticaretExample.business.abstracts.AuthService;
import eticaretExample.business.abstracts.UserService;
import eticaretExample.business.abstracts.UserVerificationService;
import eticaretExample.entities.concretes.User;

public class AuthManager implements AuthService{

	UserVerificationService verificationService;
    UserService userService;
    
    public AuthManager(UserVerificationService verificationService,
    		           UserService userService) {
        this.verificationService = verificationService;
        this.userService=userService;
    }
    
	@Override
	public void register(User user) {
		if(verificationService.isEmailValid(user.geteMail())&&user.getFirstName().length()>2&&
		        user.getLastName().length()>2&&user.getPassword().length()>=6){
		    userService.add(user);
		    return;
		}
	    System.out.println("Kayýt baþarýsýz.Girdiðiniz bilgileri kontrol ediniz.\n"
	            + "Þifre en az 6 karakter,ad soyad en az 2 karakter den olusmalýdýr."
	            + "\nGeçerli bir mail adresi girdiginizden emin olunuz.");
    }

	@Override
	public void login(String eMail, String password) {
		 if(verificationService.isEmailValid(eMail)){
	            userService.login(eMail,password);
	            return;
	        }
	        System.out.println("Geçerli bir eposta giriniz");

}
}
