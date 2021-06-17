package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	List<JobAdvertisement> getByEmployerId(int employerId);
	
	List<JobAdvertisement> getAllByStatus(boolean status);
	
	@Query("From JobAdvertisement where status = true and employer_id =:id")
	List<JobAdvertisement> getEmployersActiveJobAdvertisement(int id);

	boolean existsById(int id);
	
}