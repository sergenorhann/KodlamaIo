package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao _jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		_jobPositionDao = jobPositionDao;
	}

	@Override
	public void add(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<JobPosition> getAll() {
		System.out.println(_jobPositionDao.findAll());
		System.out.println("--"+_jobPositionDao.count());
		return _jobPositionDao.findAll();
	}

}
