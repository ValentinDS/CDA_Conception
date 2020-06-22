package dp.visitorShop;

public class Book implements Product {

	private String name;
	private int price;
	
	@Override
	public int accept(BasketVisitor _visitor) {
		return _visitor.visit(this);
	}

	public Book(String _name, int _price) {
		this.name = _name;
		this.price = _price;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getPrice() {
		return price;
		
	}
	
}
