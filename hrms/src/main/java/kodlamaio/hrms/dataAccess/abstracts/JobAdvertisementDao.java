package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Sort;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	@Query("From JobAdvertisement where status = true")
	
	List<JobAdvertisement> getByStatusAndReleaseDate(Sort sort);
	
	List<JobAdvertisement> getByStatus(boolean status);
	
	@Query("From JobAdvertisement where status = true and employer_id =:id")
	List<JobAdvertisement> getByEmployersIdAndStatus(int id);
	
	
}