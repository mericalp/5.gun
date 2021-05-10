
import java.util.ArrayList;
import java.util.List;

import verificationSimulationx.adapters.GoogleAuthorizationAdapter;
import verificationSimulationx.business.abstracts.UserAuthorizationService;
import verificationSimulationx.business.abstracts.UserService;
import verificationSimulationx.business.concretes.UserManager;
import verificationSimulationx.business.concretes.UserAuthorizationManager;
import verificationSimulationx.dataAccess.concretes.HibernateUserDao;
import verificationSimulationx.entities.concretes.User;
import verificationSimulationx.google.GoogleAuthorizationService;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1,"alp","ceren","alp@gmail.com","12345627");
		User user2=new User(1,"ahaha","mer","mer@HOTMAIL.COM","12345627");
		
		UserService userManager1=new UserManager(new UserAuthorizationManager(),new HibernateUserDao()); 
		userManager1.register(user1);
		userManager1.register(user2);
			
		
		
		
		GoogleAuthorizationAdapter googleAuthorizationAdapter=new GoogleAuthorizationAdapter(3, "2323232");
		User googleUser=googleAuthorizationAdapter.mappingUser();
		
		UserService userManager2=new UserManager(googleAuthorizationAdapter,new HibernateUserDao()); 
		userManager2.register(googleUser);	
		
		
		for (User user : userManager2.getAll()) {
			System.out.println(user.getId() +" --------------  "+user.getFirstName());
		}
		
	}

}