package kodlamaio.hrms.Adapters;

import java.rmi.RemoteException;

import kodlamaio.hrms.ConnectedService.MernisServiceReference.KPSPublicSoapProxy;
import kodlamaio.hrms.business.abstracts.UserCheckService;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalityId()), jobSeeker.getFirstName().toUpperCase(),
					jobSeeker.getLastName().toUpperCase(), jobSeeker.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {

			e.printStackTrace();
		}
		return false;
	}


}