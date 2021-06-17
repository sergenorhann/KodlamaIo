package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.City;

public interface CityService {
	Result add(City city);

	Result delete(City city);
	
	Result update(City city);

	DataResult<List<City>> getAll();

}
