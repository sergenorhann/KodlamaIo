package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilies.results.DataResult;
import kodlamaio.northwind.core.utilies.results.Result;
import kodlamaio.northwind.core.utilies.results.SuccessDataResult;
import kodlamaio.northwind.core.utilies.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao _productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		_productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(_productDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		_productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(_productDao.getByProductName(productName), "Data Listelendi");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<Product>(
				_productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(
				_productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>(_productDao.getByCategoryIn(categories), "Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(_productDao.getByProductNameContains(productName),
				"Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>(_productDao.getByProductNameStartsWith(productName),
				"Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(_productDao.getByNameAndCategory(productName, categoryId),
				"Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);

		return new  SuccessDataResult<List<Product>>(_productDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Product>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"productName");
		return new  SuccessDataResult<List<Product>>(_productDao.findAll(sort),"Başarılı");
	}

}
