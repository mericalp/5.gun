package verificationSimulationx.adapters.business.concretes;
import verificationSimulationx.business.abstracts.UserAuthorizationService;
public class UserAuthorizationManager implements UserAuthorizationService{

	@Override
	public boolean validation(String email) {

	if (email!=null) {
		System.out.println("----------------Bu kýsýmda linke týklanýldý----------------------");
		return true;
	}
		
		return false;
	}
	
	
	
}
