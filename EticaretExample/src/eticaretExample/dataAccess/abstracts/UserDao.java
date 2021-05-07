package eticaretExample.dataAccess.abstracts;

import java.util.List;

import eticaretExample.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	
}
