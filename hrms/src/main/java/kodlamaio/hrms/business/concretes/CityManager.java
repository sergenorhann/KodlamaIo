package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilies.results.DataResult;
import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.core.utilies.results.SuccessDataResult;
import kodlamaio.hrms.core.utilies.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CityDao;
import kodlamaio.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao _cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		_cityDao = cityDao;

	}

	@Override
	public Result add(City city) {
		_cityDao.save(city);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result delete(City city) {
		_cityDao.delete(city);
		return new SuccessResult("Silindi");
	}

	@Override
	public Result update(City city) {
		return new SuccessResult("Güncellendi");
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(_cityDao.findAll());
	}

}
