package verificationSimulationx.adapters.business.abstracts;



import java.util.List;

import verificationSimulationx.entities.concretes.User;










public interface UserService {

	boolean  register(User user);	
	public void login(String email,String password);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	User getById(int id);
	
	
}
