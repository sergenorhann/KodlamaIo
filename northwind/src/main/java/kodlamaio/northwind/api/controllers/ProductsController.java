package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilies.results.DataResult;
import kodlamaio.northwind.core.utilies.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService _productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		_productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		return _productService.getAll();
	}
	@GetMapping("/getallbypage")
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		return _productService.getAll(pageNo,  pageSize);
	}
	@GetMapping("/getallSorted")
	public DataResult<List<Product>> getAllSorted()
	{
		return _productService.getAllSorted();

	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this._productService.add(product);
	}

	@GetMapping("/getbyproductname")
	public DataResult<Product> getByProductName(@RequestParam String productName) {
		return _productService.getByProductName(productName);
	}

	@GetMapping("/getbyproductnameandcategory")
	public DataResult<Product> getByProductNameAndCategory(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId) {
		return _productService.getByProductNameAndCategory(productName, categoryId);
	}

	@GetMapping("/getbyproductnameorcategory")
	public DataResult<List<Product>> getByProductNameOrCategory(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId) {
		return _productService.getByProductNameOrCategory(productName, categoryId);
	}

	@GetMapping("/getbycategoryin")
	public DataResult<List<Product>> getByCategoryIn(@RequestParam List<Integer> categories) {
		return _productService.getByCategoryIn(categories);
	}

	@GetMapping("/getbyproductnamecontains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
		return _productService.getByProductNameContains(productName);
	}

	@GetMapping("/getbyproductnamestartswith")
	public DataResult<List<Product>> getByProductNameStartsWith(@RequestParam String productName) {
		return _productService.getByProductNameStartsWith(productName);
	}

	@GetMapping("/getbynameandcategory")
	public DataResult<List<Product>> getByNameAndCategory(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId) {
		return _productService.getByNameAndCategory(productName, categoryId);
	}

}
