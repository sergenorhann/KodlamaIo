package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import ConnectedService.MernisServiceReference.KPSPublicSoapProxy;
import Entities.User;


public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
        KPSPublicSoapProxy client =new KPSPublicSoapProxy();
        
        
        try {
			return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()) ,user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(),user.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
        		
        		
	}

}
