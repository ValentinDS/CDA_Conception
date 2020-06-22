package dp.visitorShop;

import java.util.ArrayList;
import java.util.List;

public class Buying {

	List<Product> products;
	
	public Buying() {
		products = new ArrayList();
		
	}
	
	public Buying(List<Product> _products) {
		products = new ArrayList();
		
		for(Product product: _products) {
			products.add(product);
			
		}
		
	}
	
	public List<Product> getProduct(){
		return products;
		
	}
	
	public void addProducts(Product _product) {
		products.add(_product);
		
	}
	
}
