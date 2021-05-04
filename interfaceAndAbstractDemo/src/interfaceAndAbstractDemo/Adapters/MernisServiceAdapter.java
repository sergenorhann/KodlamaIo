package interfaceAndAbstractDemo.Adapters;

import java.rmi.RemoteException;

import interfaceAndAbstractDemo.Abstract.CustomerCheckService;
import interfaceAndAbstractDemo.ConnectedService.MernisServiceReference.KPSPublicSoapProxy;
import interfaceAndAbstractDemo.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
        KPSPublicSoapProxy client =new KPSPublicSoapProxy();
        
        
        try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()) ,customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
        		
        		
	}

}
