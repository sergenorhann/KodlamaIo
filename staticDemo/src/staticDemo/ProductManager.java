package staticDemo;

public class ProductManager {
	public void add(Product product) {
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi : " + product.name);
		} else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
		ProductValidator productValidator= new ProductValidator();
		productValidator.bisey();
	}

}
