package dp.visitorShop;

public class Fruit implements Product {

	private String name;
	private int weight;
	private int kgPrice;
	
	@Override
	public int accept(BasketVisitor _visitor) {
		return _visitor.visit(this);
	}
	
	public Fruit(String _name, int _weight, int _kgPrice) {
		this.name = _name;
		this.weight = _weight;
		this.kgPrice = _kgPrice;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getWeight(){
		return weight;
		
	}
	
	public int getKgPrice() {
		return kgPrice;
		
	}
	
}
