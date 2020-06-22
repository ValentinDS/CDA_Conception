package dp.compositeRepertory;

public abstract class Component {
	
	protected String name;
	protected int indentation;
	
	public Component(String _name) {
		name = _name;
		indentation = 1;
	}
	
	public abstract void Directories();
	
	public abstract String Format(int _ind);
	
	public String getName() {
		return name;
		
	}
	
	public void setIndentation(int ind) {
		indentation = ind;
	}
	
	public int getIndentation() {
		return indentation;
		
	}

}
