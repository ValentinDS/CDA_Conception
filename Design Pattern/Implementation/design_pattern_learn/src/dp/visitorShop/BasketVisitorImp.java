package dp.visitorShop;

public class BasketVisitorImp implements BasketVisitor {

	@Override
	public int visit(Book _book) {
		
		if(_book.getPrice() > 30) {
			return _book.getPrice() - 5;
		}
		
		return _book.getPrice();
	}

	@Override
	public int visit(Fruit _fruit) {
		return _fruit.getKgPrice() * _fruit.getWeight();
		
	}

	
	
}
