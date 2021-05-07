package eticaretExample.core.concretes;

import eticaretExample.core.abstracts.GoogleAuthService;
import eticaretExample.registerGoogle.GoogleAuthManager;

import java.util.ArrayList;


public class GoogleAuthManagerAdapter implements GoogleAuthService {
	
	GoogleAuthManager manager=new GoogleAuthManager();
	ArrayList<String> mails=new ArrayList<String>() ;
	ArrayList<String> passwords=new ArrayList<String>() ;
	    @Override
	    public void registerToSystem(String eMail, String password) {
	    for(int i=0;i<mails.size();i++)
	    {
	        if(mails.get(i).equals(eMail)&&passwords.get(i).equals(password))
	        {
	        	System.out.println("Google ile kayýt baþarýsýz.");
	            return;
	        }
	    }
	    mails.add(eMail);
	    passwords.add(password);
	   
	    manager.register(eMail, password);
	    }

	    @Override
	    public void loginToSystem(String eMail, String password) {
	        for(int i=0;i<mails.size();i++)
	        {
	            if(mails.get(i).equals(eMail)&&passwords.get(i).equals(password))
	            {
	                manager.login(eMail, password);
	                return;
	            }
	        }
	    System.out.println("Google ile giriþ baþarýsýz.");
	    }

	}