package eticaretExample.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eticaretExample.dataAccess.abstracts.UserDao;
import eticaretExample.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	ArrayList<User> users=new ArrayList<User>();
	
	@Override
	public void add(User user) {
		  users.add(user);
		    System.out.println("Doðrulama Tamamlandý");
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
