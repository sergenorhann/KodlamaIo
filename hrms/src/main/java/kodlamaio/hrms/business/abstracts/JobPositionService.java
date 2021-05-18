package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	public void add(JobPosition jobPosition);
	public void delete(JobPosition jobPosition);
	public void update(JobPosition jobPosition);
	List<JobPosition> getAll();
}
