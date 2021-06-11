package kodlamaio.hrms.Adapters;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Locale;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.ConnectedService.MernisServiceReference.KPSPublicSoapProxy;
import kodlamaio.hrms.business.abstracts.UserCheckService;

@Service
public class MernisServiceAdapter  implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(String nationalityId, String firstName, String lastName, LocalDate dateOfBirth) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(nationalityId), firstName.toUpperCase(new Locale("tr")),
					lastName.toUpperCase(new Locale("tr")), dateOfBirth.getYear());

		} catch (NumberFormatException | RemoteException e) {

			e.printStackTrace();
		}
		return false;
	}


}