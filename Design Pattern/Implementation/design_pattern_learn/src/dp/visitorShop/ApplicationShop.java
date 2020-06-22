package dp.visitorShop;

import java.util.ArrayList;
import java.util.List;

public class ApplicationShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPrice = 0;
		
		BasketVisitorImp basketVisitor = new BasketVisitorImp();
		
		Book lesMiserables = new Book("Les misérables", 30);
		Book lesFables = new Book("Les fables de la Fontaine", 15);
		Fruit pomme = new Fruit("Pomme", 1, 4);
		Fruit banane = new Fruit("Banane", 1, 3);
		
		Buying basketBuying = new Buying();
		basketBuying.addProducts(lesMiserables);
		basketBuying.addProducts(lesFables);
		basketBuying.addProducts(pomme);
		basketBuying.addProducts(banane);
		basketBuying.addProducts(new Book("Artbook Design", 45));
		
		List<Product> productList = basketBuying.getProduct();
		
		for(Product _product: productList) {
			totalPrice += _product.accept(basketVisitor);
			
		}
		
		System.out.println("Prix total du panier : " + totalPrice);
		
	}

}
