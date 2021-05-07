package eticaretExample.business.concretes;

import java.util.regex.Pattern;

import eticaretExample.business.abstracts.UserVerificationService;

public class EMailVerificationManager implements UserVerificationService{

	private String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public boolean isEmailValid(String emailInput) {
		        Pattern pattern = Pattern.compile(EMAIL_PATTERN,
				Pattern.CASE_INSENSITIVE);
				return pattern.matcher(emailInput).find();
	}

}
