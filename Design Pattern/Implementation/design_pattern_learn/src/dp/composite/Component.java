package dp.composite;

public abstract class Component {
	protected String name;
	protected int level;
	
	public Component(String _name) {
		this.name = _name;
		
		
	}
	
	public abstract void operation();
	
	
}
